package sg.edu.rp.c346.id20012912.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicReference;

public class PlacesInfo extends AppCompatActivity {
    TextView Description;
    TextView Address;
    TextView Opening;
    TextView Daysclosed;
    TextView GetThere;
    TextView Phone;
    TextView link;
    Button back;
    String[] links;
    String WordClicked = " ";
    String description = " ";
    String address = " ";

    MenuItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_info);

        Intent getPlacesInfo = getIntent();
        this.setTitle("Places Information");
        String LinkSelected = getPlacesInfo.getStringExtra("For more information, please click the link: ");

        links = new String[10];
        links[0] = "https://www.rwsentosa.com/en/attractions/universal-studios-singapore/plan-your-visit";
        links[1] = "https://www.rwsentosa.com/en/attractions/sea-aquarium/explore";
        links[2] = "https://www.wrs.com.sg/en/singapore-zoo/plan-your-visit.html";

        links[3] = "https://www.wrs.com.sg/en/night-safari.html";
        links[4] = "https://www.wrs.com.sg/en/jurong-bird-park.html";
        links[5] = "https://www.marinabaysands.com/";

        links[6] = "https://www.nparks.gov.sg/gardens-parks-and-nature/parks-and-nature-reserves/east-coast-park";
        links[7] = "https://www.visitsingapore.com/see-do-singapore/nature-wildlife/singapore-islands/pulau-ubin/";
        links[8] = "https://www.visitsingapore.com/see-do-singapore/history/history-museums/national-museum-of-singapore/";
        links[9] = "https://www.science.edu.sg/";

        Description = findViewById(R.id.Description);
        registerForContextMenu(Description);

        Address = findViewById(R.id.Address);
        registerForContextMenu(Address);

        Opening = findViewById(R.id.Opening);
        registerForContextMenu(Opening);

        Daysclosed = findViewById(R.id.DaysClosed);
        registerForContextMenu(Daysclosed);

        GetThere = findViewById(R.id.Getthere);
        registerForContextMenu(GetThere);

        link = findViewById(R.id.link);
        registerForContextMenu(link);

        Phone = findViewById(R.id.Phone);
        registerForContextMenu(Phone);

        back = findViewById(R.id.back);

        description = getPlacesInfo.getStringExtra("Description: ");
        address = getPlacesInfo.getStringExtra("Address: ");
        String opening = getPlacesInfo.getStringExtra("Opening Hours: ");
        String daysclosed = getPlacesInfo.getStringExtra("Days Closed: ");
        String place = getPlacesInfo.getStringExtra("Getting there: ");
        String url = getPlacesInfo.getStringExtra("For more information, please click the link: ");
        int phone = getPlacesInfo.getIntExtra("Phone: ", 0);


        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (url.equalsIgnoreCase(links[0])) {
                    Uri uri = Uri.parse("https://www.rwsentosa.com/en/attractions/universal-studios-singapore/plan-your-visit");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }

                if (url.equalsIgnoreCase(links[1])) {
                    Uri uri2 = Uri.parse("https://www.rwsentosa.com/en/attractions/sea-aquarium/explore");
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                    startActivity(intent2);
                }

                if (url.equalsIgnoreCase(links[2])) {
                    Uri uri3 = Uri.parse("https://www.wrs.com.sg/en/singapore-zoo/plan-your-visit.html");
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                    startActivity(intent3);

                }

                if (url.equalsIgnoreCase(links[3])) {
                    Uri uri4 = Uri.parse("https://www.wrs.com.sg/en/night-safari.html");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);

                }

                if (url.equalsIgnoreCase(links[4])) {
                    Uri uri5 = Uri.parse("https://www.wrs.com.sg/en/jurong-bird-park.html");
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                    startActivity(intent5);

                }

                if (url.equalsIgnoreCase(links[5])) {
                    Uri uri6 = Uri.parse("https://www.marinabaysands.com/");
                    Intent intent6 = new Intent(Intent.ACTION_VIEW, uri6);
                    startActivity(intent6);
                }

                if (url.equalsIgnoreCase(links[6])) {
                    Uri uri7 = Uri.parse("https://www.nparks.gov.sg/gardens-parks-and-nature/parks-and-nature-reserves/east-coast-park");
                    Intent intent7 = new Intent(Intent.ACTION_VIEW, uri7);
                    startActivity(intent7);

                }

                if (url.equalsIgnoreCase(links[7])) {
                    Uri uri8 = Uri.parse("https://www.visitsingapore.com/see-do-singapore/nature-wildlife/singapore-islands/pulau-ubin/");
                    Intent intent8 = new Intent(Intent.ACTION_VIEW, uri8);
                    startActivity(intent8);

                }

                if (url.equalsIgnoreCase(links[8])) {
                    Uri uri9 = Uri.parse("https://www.visitsingapore.com/see-do-singapore/history/history-museums/national-museum-of-singapore/");
                    Intent intent9 = new Intent(Intent.ACTION_VIEW, uri9);
                    startActivity(intent9);

                }

                if (url.equalsIgnoreCase(links[9])) {
                    Uri uri10 = Uri.parse("https://www.science.edu.sg/");
                    Intent intent10 = new Intent(Intent.ACTION_VIEW, uri10);
                    startActivity(intent10);

                }
            }
        });


        Description.setText("Description: " + description);
        Address.setText("Address: " + address);
        Opening.setText("Opening Hours: " + opening);
        Daysclosed.setText("Days Closed: " + daysclosed);
        GetThere.setText("Getting there: " + place);
        link.setText("To Find out more: " + url);
        Phone.setText("Phone: " + phone);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == R.id.EnglishSelect)
        {
            Toast.makeText(PlacesInfo.this, "English selected", Toast.LENGTH_LONG).show();

            if (description.equalsIgnoreCase(" Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!")) {
                Description.setText(" Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!");

                Address.setText("8 Sentosa Gateway, 098269");
                Opening.setText("2pm-9pm");
                Daysclosed.setText("Tuesday");
                GetThere.setText("Sentosa Express train, Shuttle Bus at VivoCity, Drive in");

            } else if (description.equalsIgnoreCase("Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.")) {
                Description.setText("Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.");
                Address.setText("8 Sentosa Gateway, 098269");
                Opening.setText("10pm-5pm");
                Daysclosed.setText("Tuesday-Friday, Sunday");
                GetThere.setText("Sentosa Express train, Drive in, Cycling, BlueSG Car Sharing");

            } else if (description.equalsIgnoreCase("The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature. \"")) {
                Description.setText("The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature.");
                Address.setText("80 Mandai Lake Rd,729826");
                Opening.setText("8.30am-6pm");
                Daysclosed.setText("N.A");
                GetThere.setText("Drive in, Mandai khatib Shuttle Bus, Mandi Express(Bedok, Sengkang, Tampines)");

            } else if (description.equalsIgnoreCase("Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.")) {
                Description.setText("Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.");
                Address.setText("80 Mandai Lake Rd,729826");
                Opening.setText("6.30pm-12pm");
                Daysclosed.setText("Monday, Tuesday");
                GetThere.setText("Drive in, Mandai khatib Shuttle Bus, Mandi Express(Bedok, Sengkang, Tampines)");
            } else if (description.equalsIgnoreCase("Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.")) {
                Description.setText("Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.");
                Address.setText("2 Jurong Hill, 628925");
                Opening.setText("8.30pm-6pm");
                Daysclosed.setText("N.A");
                GetThere.setText("Drive in, Mandai khatib Shuttle Bus, Mandi Express(Bedok, Sengkang, Tampines)");

            } else if (description.equalsIgnoreCase("Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.")) {
                Description.setText(" Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.");
                Address.setText("10 Bayfront Ave, Singapore 018956");
                Opening.setText("10pm-5pm");
                Daysclosed.setText("Tuesday-Friday, Sunday");
                GetThere.setText("Train to Marina Bay Sands Station, Drive in, BlueSG Car Sharing, Bus 97, 106, 518, 133, 502");
            } else if (description.equalsIgnoreCase("East Coast Park(ECP) is a beach surrounding Marine Parade, Bedok and Tampaines. It offers bike rental services, a play area and various eateries for vistors to enjoy.")) {
                Description.setText("East Coast Park(ECP) is a beach surrounding Marine Parade, Bedok and Tampaines. It offers bike rental services, a play area and various eateries for vistors to enjoy.");
                Address.setText("East Coast Park Service Rd");
                Opening.setText("24 hours");
                Daysclosed.setText("N.A");
                GetThere.setText("Drive in, Cycling, Bus 31, 196, 16");

            } else if (description.equalsIgnoreCase("Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students. By doing so, people can easily explore the island while transforming students into leaders. Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.")) {
                Description.setText("Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students. By doing so, people can easily explore the island while transforming students into leaders. Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.");
                Address.setText("51 Lor Bekukong, Singapore 499172");
                Opening.setText("7am-7pm");
                Daysclosed.setText("N.A");
                GetThere.setText("Boat via Changi Point Ferry Terminal");
            } else if (description.equalsIgnoreCase(" Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.")) {
                Description.setText("Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.");
                Address.setText("93 Stamford Rd, Singapore 178897");
                Opening.setText("8.30am-6pm");
                GetThere.setText(" Drive in, Alight at Beencoolean/Bras Basah/Dhoby Ghaut/City Hall Train Station, Taxi");

            } else if (description.equalsIgnoreCase("Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.")) {
                Description.setText("Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.");
                Address.setText("15 Science Centre Rd, Singapore 609081");
                Opening.setText("10am-1pm, 2pm-5pm");
                Daysclosed.setText("Monday, Tuesday, Thursday");
                GetThere.setText(" Drive in, Bus 51,52,78,79, Train(Jurong East Station)");
            }

        }

        else if (item.getItemId() == R.id.ChineseSelect) {
            Toast.makeText(PlacesInfo.this, "Chinese selected", Toast.LENGTH_LONG).show();

            if (description.equalsIgnoreCase(" Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!")) {
                Description.setText("这个地方位于圣淘沙名胜世界，拥有 28 个游乐设施和表演，非常适合家庭、儿童和老年人，因为它可以为每个人带来乐趣。更重要的是，它提供实惠的价格和促销套餐，让您享受一整天的刺激!");
                Address.setText("8 Sentosa Gateway, 098269");
                Opening.setText(" 下午 2 点至 9 点");
                Daysclosed.setText("星期二");
                GetThere.setText("圣淘沙快车，怡丰城穿梭巴士，开车进");

            } else if (description.equalsIgnoreCase("Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.")) {
                Description.setText(" 当您遇到壮观的双髻鲨和聪明的宽吻海豚时，您将熟悉海洋栖息地。在探索池近距离探索海洋生物，在全景开阔海洋栖息地观看五颜六色的鱼、鳐鱼和鲨鱼。");
                Address.setText("8 Sentosa Gateway, 098269");
                Opening.setText("上午 10 点至下午 5 点");
                Daysclosed.setText("周二至周五、周日");
                GetThere.setText("圣淘沙特快列车、上车、骑车、BlueSG 汽车共享");

            } else if (description.equalsIgnoreCase("The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature and animals")) {
                Description.setText("新加坡动物园是您需要参观的另一个一站式冒险。这个地方适合所有年龄段的人，因为他们不仅可以享受与动物近距离互动的乐趣，而且还有机会拍摄精美的照片可爱的植物群。考虑到这一点，新加坡动物园绝对是一个能让您更接近自然和动物的地方");
                Address.setText("80 Mandai Lake Rd,729826");
                Opening.setText("上午 8.30 点至下午 6 点");
                Daysclosed.setText("N.A");
                GetThere.setText(" 驶入, Mandai khatib 穿梭巴士、Mandi Express（勿洛、盛港、淡滨尼）");

            } else if (description.equalsIgnoreCase("Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.")) {
                Description.setText("夜间野生动物园位于新加坡动物园附近，是世界上第一个夜间野生动物园，每年吸引约 130 万游客，并饲养了约 100 个物种的近 900 只动物");
                Address.setText("80 Mandai Lake Rd,729826");
                Opening.setText("下午 6.30 点至 午夜 12 点");
                Daysclosed.setText("星期一,星期二");
                GetThere.setText("驶入, Mandai khatib 穿梭巴士、Mandi Express（勿洛、盛港、淡滨尼）");
            } else if (description.equalsIgnoreCase("Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.")) {
                Description.setText("裕廊飞禽公园被指定在裕廊地区，是一个占地 0.2 平方公里（49 英亩）的鸟舍。它现在是世界著名的鸟类动物园，那里有来自世界各地的壮丽鸟类标本。");
                Address.setText("2 Jurong Hill, 628925");
                Opening.setText("上午 8.30 下午 6 点");
                Daysclosed.setText("N.A");
                GetThere.setText("驶入, Mandai khatib 穿梭巴士、Mandi Express（勿洛、盛港、淡滨尼）");

            } else if (description.equalsIgnoreCase("Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.")) {
                Description.setText("滨海湾金沙 (MBS) 被誉为新加坡的购物天堂之一，提供种类繁多的商店和服务供您探索。更重要的是，MBS拥有3座55层高的酒店塔楼，游客可以在那里度过他们的假期.");
                Address.setText("10 Bayfront Ave, Singapore 018956");
                Opening.setText("上午 10 下午 11 点");
                Daysclosed.setText("周二至周五、周日");
                GetThere.setText("火车到滨海湾金沙站，开车，BlueSG 汽车共享，巴士 97、106、518、133、502");
            } else if (description.equalsIgnoreCase("East Coast Park(ECP) is a beach surrounding Marine Parade, Bedok and Tampaines. It offers bike rental services, a play area and various eateries for vistors to enjoy.")) {
                Description.setText("东海岸公园 (ECP) 是一个围绕着马林百列、勿洛和淡佩因的海滩。它提供自行车出租服务、游乐区和各种供游客享用的餐馆.");
                Address.setText("East Coast Park Service Rd");
                Opening.setText("24小时");
                Daysclosed.setText("N.A");
                GetThere.setText("开车，骑自行车，31、196、16路公交车");

            } else if (description.equalsIgnoreCase("Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students.Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.")) {
                Description.setText("位于新加坡东北部，您有机会探索乡村生活并亲近大自然。它还为游客提供自行车租赁服务和为中三学生提供拓展训练（OBS）项目。确实，它无疑是人们创造美好回忆、了解乡村生活方式的同时与自然互动的目的地。");
                Address.setText("51 Lor Bekukong, Singapore 499172");
                Opening.setText("早上 7 点到晚上 7 点");
                Daysclosed.setText("N.A");
                GetThere.setText("乘船经过樟宜点渡轮码头");
            } else if (description.equalsIgnoreCase(" Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.")) {
                Description.setText("也被称为新加坡最古老的博物馆，它使人们能够深入了解新加坡的历史，最早可追溯到 13 世纪。在那里，游客可以一睹各种手工艺品并观看新加坡过去的短片");
                Address.setText("93 Stamford Rd, Singapore 178897");
                Opening.setText("上午 8.30 下午 6 点");
                GetThere.setText("上车，在 Bencoolean/Bras Basah/Dhoby Ghaut/City Hall Train Station 下车，出租车");

            } else if (description.equalsIgnoreCase("Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.")) {
                Description.setText("同样位于裕廊地区，科学中心是一个提供一系列科学展览、实验和各种活动的地方，让公众更多地了解科学及其应用");
                Address.setText("15 Science Centre Rd, Singapore 609081");
                Opening.setText("上午 10 点至下午 1 点，下午 2 点至下午 5 点");
                Daysclosed.setText("周一、周二、周四");
                GetThere.setText(" 上车，公交车 51,52,78,79, 火车（裕廊东站");
            }
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "Small");
        menu.add(0, 1, 1, "Medium");
        menu.add(0, 2, 2, "Big");

        if (v == Description) {
            if (description.equalsIgnoreCase(" Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!")) {
                WordClicked = " Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!";
            }

            if (description.equalsIgnoreCase("Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.")) {

                WordClicked = "Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.";
            }

            if (description.equalsIgnoreCase("The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature and animals")) {
                WordClicked = "The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature and animals";
            }

            if (description.equalsIgnoreCase("Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.")) {
                WordClicked = "Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.";
            }


            if (description.equalsIgnoreCase("Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.")) {
                WordClicked = "Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.";
            }

            if (description.equalsIgnoreCase("Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.")) {

                WordClicked = "Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.";
            }

            if (description.equalsIgnoreCase("Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students.Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.")) {

                WordClicked = "Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students.Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.";
            }

            if (description.equalsIgnoreCase(" Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.")) {
                WordClicked = " Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.";
            }


            if (description.equalsIgnoreCase("Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.")) {

                WordClicked = "Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.";
            }


        }

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item)
    {


        if ((item.getItemId() == 0))
        {
            if (WordClicked.equalsIgnoreCase(" Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!")) {
                WordClicked = "Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!";
                Description.setTextAppearance(getApplication(), R.style.font_Small);


            }


            if (WordClicked.equalsIgnoreCase("Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.")) {

                WordClicked = "Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.";
                Description.setTextAppearance(getApplication(), R.style.font_Small);

            }

            if (WordClicked.equalsIgnoreCase("The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature and animals")) {
                WordClicked = "The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature and animals";
                Description.setTextAppearance(getApplication(), R.style.font_Small);


            }

            if (WordClicked.equalsIgnoreCase("Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.")) {

                WordClicked = "Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.";
                Description.setTextAppearance(getApplication(), R.style.font_Small);


            } else if (WordClicked.equalsIgnoreCase("Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.")) {
                WordClicked = "Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.";
                Description.setTextAppearance(getApplication(), R.style.font_Small);

                //textView.setTextAppearance(getActivity(), R.style.fontForNotificationLandingPage);
            } else if (WordClicked.equalsIgnoreCase("Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.")) {

                WordClicked = "Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.";
                Description.setTextAppearance(getApplication(), R.style.font_Small);

            } else if (WordClicked.equalsIgnoreCase(" East Coast Park(ECP) is a beach surrounding Marine Parade, Bedok and Tampaines. It offers bike rental services, a play area and various eateries for vistors to enjoy.")) {
                WordClicked = "East Coast Park(ECP) is a beach surrounding Marine Parade, Bedok and Tampaines. It offers bike rental services, a play area and various eateries for vistors to enjoy.";
                Description.setTextAppearance(getApplication(), R.style.font_Small);


            } else if (WordClicked.equalsIgnoreCase("Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students.Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.")) {

                WordClicked = "Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students.Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.";
                Description.setTextAppearance(getApplication(), R.style.font_Small);
            }

            if (WordClicked.equalsIgnoreCase(" Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.")) {
                WordClicked = " Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.";
                Description.setTextAppearance(getApplication(), R.style.font_Small);
                //textView.setTextAppearance(getActivity(), R.style.fontForNotificationLandingPage);
            }

            if (WordClicked.equalsIgnoreCase("Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.")) {

                WordClicked = "Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.";
                Description.setTextAppearance(getApplication(), R.style.font_Small);
            }

            Description.setTextSize(14);

        }


        if (item.getItemId() == 1) {
            if (WordClicked.equalsIgnoreCase(" Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!")) {
                WordClicked = " Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!";
                Description.setTextAppearance(getApplication(), R.style.font_Medium);
                //textView.setTextAppearance(getActivity(), R.style.fontForNotificationLandingPage);
            }

            if (WordClicked.equalsIgnoreCase("Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.")) {

                WordClicked = "Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.";
                Description.setTextAppearance(getApplication(), R.style.font_Medium);
            }

            if (WordClicked.equalsIgnoreCase("The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature and animals")) {
                WordClicked = "The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature and animals";
                Description.setTextAppearance(getApplication(), R.style.font_Medium);

            }

            if (WordClicked.equalsIgnoreCase("Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.")) {

                WordClicked = "Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.";
                Description.setTextAppearance(getApplication(), R.style.font_Medium);

            } else if (WordClicked.equalsIgnoreCase("Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.")) {
                WordClicked = "Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.";
                Description.setTextAppearance(getApplication(), R.style.font_Medium);

                //textView.setTextAppearance(getActivity(), R.style.fontForNotificationLandingPage);
            } else if (WordClicked.equalsIgnoreCase("Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.")) {

                WordClicked = "Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.";
                Description.setTextAppearance(getApplication(), R.style.font_Medium);
            } else if (WordClicked.equalsIgnoreCase(" East Coast Park(ECP) is a beach surrounding Marine Parade, Bedok and Tampaines. It offers bike rental services, a play area and various eateries for vistors to enjoy.")) {
                WordClicked = "East Coast Park(ECP) is a beach surrounding Marine Parade, Bedok and Tampaines. It offers bike rental services, a play area and various eateries for vistors to enjoy.";
                Description.setTextAppearance(getApplication(), R.style.font_Medium);

            } else if (WordClicked.equalsIgnoreCase("Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students.Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.")) {

                WordClicked = "Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students.Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.";
                Description.setTextAppearance(getApplication(), R.style.font_Medium);
            }

            if (WordClicked.equalsIgnoreCase(" Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.")) {
                WordClicked = " Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.";
                Description.setTextAppearance(getApplication(), R.style.font_Medium);
                //textView.setTextAppearance(getActivity(), R.style.fontForNotificationLandingPage);
            }

            if (WordClicked.equalsIgnoreCase("Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.")) {

                WordClicked = "Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.";
                Description.setTextAppearance(getApplication(), R.style.font_Medium);
            }

            Description.setTextSize(18);
        }


        if ((item.getItemId() == 2)) {
            if (WordClicked.equalsIgnoreCase(" Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!")) {
                WordClicked = " Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!";
                Description.setTextAppearance(getApplication(), R.style.font_Big);
                //textView.setTextAppearance(getActivity(), R.style.fontForNotificationLandingPage);
            }

            if (WordClicked.equalsIgnoreCase("Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.")) {

                WordClicked = "Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.";
                Description.setTextAppearance(getApplication(), R.style.font_Big);
            }

            if (WordClicked.equalsIgnoreCase("The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature and animals")) {
                WordClicked = "The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature and animals";
                Description.setTextAppearance(getApplication(), R.style.font_Big);

            }

            if (WordClicked.equalsIgnoreCase("Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.")) {

                WordClicked = "Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.";
                Description.setTextAppearance(getApplication(), R.style.font_Big);

            } else if (WordClicked.equalsIgnoreCase("Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.")) {
                WordClicked = "Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world.";
                Description.setTextAppearance(getApplication(), R.style.font_Big);

                //textView.setTextAppearance(getActivity(), R.style.fontForNotificationLandingPage);
            } else if (WordClicked.equalsIgnoreCase("Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.")) {

                WordClicked = "Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.";
                Description.setTextAppearance(getApplication(), R.style.font_Big);
            } else if (WordClicked.equalsIgnoreCase(" East Coast Park(ECP) is a beach surrounding Marine Parade, Bedok and Tampaines. It offers bike rental services, a play area and various eateries for vistors to enjoy.")) {
                WordClicked = "East Coast Park(ECP) is a beach surrounding Marine Parade, Bedok and Tampaines. It offers bike rental services, a play area and various eateries for vistors to enjoy.";
                Description.setTextAppearance(getApplication(), R.style.font_Big);

            } else if (WordClicked.equalsIgnoreCase("Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students.Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.")) {

                WordClicked = "Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students.Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.";
                Description.setTextAppearance(getApplication(), R.style.font_Big);
            }

            if (WordClicked.equalsIgnoreCase(" Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.")) {
                WordClicked = " Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.";
                Description.setTextAppearance(getApplication(), R.style.font_Big);
                //textView.setTextAppearance(getActivity(), R.style.fontForNotificationLandingPage);
            }

            if (WordClicked.equalsIgnoreCase("Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.")) {

                WordClicked = "Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.";
                Description.setTextAppearance(getApplication(), R.style.font_Big);
            }

            Description.setTextSize(22);
        }
        return super.onContextItemSelected(item);
    }
}














