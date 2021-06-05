package sg.edu.rp.c346.id20012912.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    TextView SGExplore, Description;
    TextView USS, SEA, Zoo, Safari, BirdPark;
    TextView MBS, Ecp, Ubin, Museum, Science;
    String wordClicked = " ";


    ToggleButton exit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SGExplore = findViewById(R.id.SGExplore);
        registerForContextMenu(SGExplore);
        SGExplore.setTextColor(Color.parseColor("#48BDBD"));

        Description = findViewById(R.id.Description);
        registerForContextMenu(Description);
        Description.setTextColor(Color.parseColor("#48BDBD"));

        USS = findViewById(R.id.USS);
        registerForContextMenu(USS);
        USS.setTextColor(Color.parseColor("#48BDBD"));

        SEA = findViewById(R.id.SEA);
        registerForContextMenu(SEA);
        SEA.setTextColor(Color.parseColor("#48BDBD"));

        Zoo = findViewById(R.id.Zoo);
        registerForContextMenu(Zoo);
        Zoo.setTextColor(Color.parseColor("#48BDBD"));

        Safari = findViewById(R.id.Safari);
        registerForContextMenu(Safari);
        Safari.setTextColor(Color.parseColor("#48BDBD"));

        BirdPark = findViewById(R.id.BirdPark);
        registerForContextMenu(BirdPark);
        BirdPark.setTextColor(Color.parseColor("#48BDBD"));

        MBS = findViewById(R.id.MBS);
        registerForContextMenu(MBS);
        MBS.setTextColor(Color.parseColor("#48BDBD"));

        Ecp = findViewById(R.id.ECP);
        registerForContextMenu(Ecp);
        Ecp.setTextColor(Color.parseColor("#48BDBD"));

        Ubin = findViewById(R.id.Ubin);
        registerForContextMenu(Ubin);
        Ubin.setTextColor(Color.parseColor("#48BDBD"));

        Museum = findViewById(R.id.Museum);
        registerForContextMenu(Museum);
        Museum.setTextColor(Color.parseColor("#48BDBD"));

        Science = findViewById(R.id.Science);
        registerForContextMenu(Science);
        Science.setTextColor(Color.parseColor("#48BDBD"));

        exit = findViewById(R.id.Exit);


        USS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlacesInfo.class);
                intent.putExtra("Description: ", " Located in Resorts World Sentosa, This place features 28 rides and shows and it is really suitable for families, kids and Seniors as it brings out the fun in everyone. What's more, it offers affordable prices and promotion packages for you to enjoy the thrill for the entire day!");
                intent.putExtra("Address: ", "8 Sentosa Gateway, 098269");
                intent.putExtra("Opening Hours: ", "2pm-9pm");
                intent.putExtra("Days Closed: ", "Tuesday");
                intent.putExtra("Getting there: ", "Sentosa Express train, Shuttle Bus at VivoCity, Drive in");
                intent.putExtra("Phone: ", 6577888);
                intent.putExtra("For more information, please click the link: ", "https://www.rwsentosa.com/en/attractions/universal-studios-singapore/plan-your-visit");

                startActivity(intent);
            }
        });

        SEA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlacesInfo.class);
                intent.putExtra("Description: ", "Get acquainted with the marine habitats as you meet the magnificent hammerhead sharks and the intelligent bottlenose dolphins. Discover sea life up close at the Discovery Pool and watch the colorful fish, rays and sharks surround you in the panoramic Open Ocean Habitat.");
                intent.putExtra("Address: ", "8 Sentosa Gateway, 098269");
                intent.putExtra("Opening Hours: ", "10am-5pm");
                intent.putExtra("Days Closed: ", "Tuesday-Friday, Sunday");
                intent.putExtra("Getting there: ", "Sentosa Express train, Drive in, Cycling, BlueSG Car Sharing");
                intent.putExtra("Phone: ", 6577888);
                intent.putExtra("For more information, please click the link: ", "https://www.rwsentosa.com/en/attractions/sea-aquarium/explore");

                startActivity(intent);
            }
        });

        Zoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlacesInfo.class);
                intent.putExtra("Description: ", "The Singapore Zoo is another one-stop adventure that you need to visit. This place is suitable for People all of ages as not only they will get to enjoy interacting with the animals up close, but also having a chance to snap good photos of the lovely flora. With this in mind, Singapore zoo is definietly a place that will bring you one step closer to nature. ");
                intent.putExtra("Address: ", "80 Mandai Lake Rd,729826");
                intent.putExtra("Opening Hours: ", "8.30am-6pm");
                intent.putExtra("Days Closed: ", "N.A");
                intent.putExtra("Getting there: ", " Drive in, Mandai khatib Shuttle Bus, Mandi Express(Bedok, Sengkang, Tampines)");
                intent.putExtra("For more information, please click the link: ", "https://www.wrs.com.sg/en/singapore-zoo/plan-your-visit.html");


                startActivity(intent);
            }
        });

        Safari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlacesInfo.class);
                intent.putExtra("Description: ", "Located in the vicinity of Singapore Zoo, Night Safrai is the world's first nocturnal wildlife park, attracting approximately 1.3 million visitors annually and housing close to 900 animals from approximately 100 species.");
                intent.putExtra("Address: ", "80 Mandai Lake Rd,729826");
                intent.putExtra("Opening Hours: ", "6.30pm-12pm");
                intent.putExtra("Days Closed: ", "Monday, Tuesday");
                intent.putExtra("Getting there: ", " Drive in, Mandai khatib Shuttle Bus, Mandi Express(Bedok, Sengkang, Tampines)");
                intent.putExtra("For more information, please click the link: ", "https://www.wrs.com.sg/en/night-safari.html");
                intent.putExtra("Phone: ", 62693411);

                startActivity(intent);
            }
        });

        BirdPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlacesInfo.class);
                intent.putExtra("Description: ", "Designated in the Jurong Region, it is an aviary covering an area of 0.2 square kilometres (49 acres). It is now a world-famous bird zoo where there are specimens of magnificent bird life from around the world. ");
                intent.putExtra("Address: ", "2 Jurong Hill, 628925");
                intent.putExtra("Opening Hours: ", "8:30am–6pm");
                intent.putExtra("Days Closed: ", "N.A");
                intent.putExtra("Getting there: ", " Drive in, Mandai khatib Shuttle Bus, Mandi Express(Bedok, Sengkang, Tampines)");
                intent.putExtra("For more information, please click the link: ", "https://www.wrs.com.sg/en/jurong-bird-park.html");
                intent.putExtra("Phone: ", 62693411);

                startActivity(intent);
            }
        });

        MBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlacesInfo.class);
                intent.putExtra("Description: ", "Known as one of Singapore's shopping paradises, Marina Bay Sands(MBS) offers a wide array of shops and services for you to explore. What's more, MBS has 3 55-storey high hotel towers, where visitors can take spend their staycation there.");
                intent.putExtra("Address: ", "10 Bayfront Ave, Singapore 018956");
                intent.putExtra("Opening Hours: ", "10am-5pm");
                intent.putExtra("Days Closed: ", "Tuesday-Friday, Sunday");
                intent.putExtra("Getting there: ", "Train to Marina Bay Sands Station, Drive in, BlueSG Car Sharing, Bus 97, 106, 518, 133, 502");
                intent.putExtra("For more information, please click the link: ", "https://www.marinabaysands.com/");
                intent.putExtra("Phone: ", 66888868);

                startActivity(intent);
            }
        });

        Ecp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlacesInfo.class);
                intent.putExtra("Description: ", "East Coast Park(ECP) is a beach surrounding Marine Parade, Bedok and Tampaines. It offers bike rental services, a play area and various eateries for vistors to enjoy.");
                intent.putExtra("Address: ", "East Coast Park Service Rd");
                intent.putExtra("Opening Hours: ", "24 hours");
                intent.putExtra("Days Closed: ", "N.A");
                intent.putExtra("Getting there: ", " Drive in, Cycling, Bus 31, 196, 16");
                intent.putExtra("For more information, please click the link: ", "https://www.nparks.gov.sg/gardens-parks-and-nature/parks-and-nature-reserves/east-coast-park");

                startActivity(intent);
            }
        });

        Ubin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlacesInfo.class);
                intent.putExtra("Description: ", "Situated in the north east of Singapore, one has the opportunity to explore the village life and get up close to nature. It also offers bike rental services for visitors and Outward Bounds(OBS) programmes for secondary 3 students. By doing so, people can easily explore the island while transforming students into leaders. Indeed, it is surely a destination for people to create good memories, gain insight on village lifestyle while interacting with nature at the same time.");
                intent.putExtra("Nearest Address: ", "51 Lor Bekukong, Singapore 499172");
                intent.putExtra("Opening Hours: ", "7am-7pm");
                intent.putExtra("Days Closed: ", "N.A");
                intent.putExtra("Getting there: ", "Boat via Changi Point Ferry Terminal");
                intent.putExtra("For more information, please click the link: ", "https://www.visitsingapore.com/see-do-singapore/nature-wildlife/singapore-islands/pulau-ubin/");

                startActivity(intent);
            }
        });

        Museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlacesInfo.class);
                intent.putExtra("Description: ", " Also known as Singapore's oldest Museum, it enables people to gain an insight to the history of Singapore, dating as early as 13 century. In there, visitors get to glimpse on various artefacts and watch short films of Singapore's past.");
                intent.putExtra("Address: ", "93 Stamford Rd, Singapore 178897");
                intent.putExtra("Opening Hours: ", "8:30am–6pm");
                intent.putExtra("Days Closed: ", "N.A");
                intent.putExtra("Admissions: ", "Free for Singaporeans and child below 6 years old ");
                intent.putExtra("Getting there: ", " Drive in, Alight at Beencoolean/Bras Basah/Dhoby Ghaut/City Hall Train Station, Taxi");
                intent.putExtra("For more information, please click the link: ", "https://www.visitsingapore.com/see-do-singapore/history/history-museums/national-museum-of-singapore/");
                intent.putExtra("Phone: ", 63323659);

                startActivity(intent);
            }
        });

        Science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlacesInfo.class);
                intent.putExtra("Description: ", "Also destinated in the Jurong Region, Science Centre is a place where it offers a series of Science exhibits, experiments and various events for the public to learn more about Science and its applications.");
                intent.putExtra("Address: ", "15 Science Centre Rd, Singapore 609081");
                intent.putExtra("Opening Hours: ", "10am-1pm, 2pm-5pm");
                intent.putExtra("Days Closed: ", "Monday, Tuesday, Thursday");
                intent.putExtra("Getting there: ", " Drive in, Bus 51,52,78,79, Train(Jurong East Station)");
                intent.putExtra("For more information, please click the link: ", "https://www.science.edu.sg/");
                intent.putExtra("Phone: ", 64252500);


                startActivity(intent);
            }
        });


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.EnglishSelection) {
            Toast.makeText(MainActivity.this, "English selected", Toast.LENGTH_LONG).show();

            SGExplore.setText("SG Explore");
            Description.setText("Hello there! Welcome to SG Explore. Here you will get to know 10 places of interest in Singapore with just a click:");
            USS.setText("Universal Studios");
            SEA.setText("S.E.A aquarium");
            Zoo.setText("Singapore Zoo");

            Safari.setText("Night Safari");
            BirdPark.setText("Jurong BirdPark");
            MBS.setText("Marina Bay Sands");

            Ecp.setText("East Coast Park");
            Ubin.setText("Pualu Ubin");
            Museum.setText("Night Safari");
            Science.setText("Science Centre");

        } else if (item.getItemId() == R.id.ChineseSelection) {
            Toast.makeText(MainActivity.this, "Mandarin selected", Toast.LENGTH_LONG).show();

            SGExplore.setText("SG 探索");
            Description.setText("你好呀！欢迎来到SG探索。在这里，您只需点击一下即可了解新加坡的 10 个名胜古迹: ");
            USS.setText("环球影城");
            SEA.setText("海洋水族馆");
            Zoo.setText("新加坡动物园");

            Safari.setText("夜间野生动物园");
            BirdPark.setText("裕廊飞禽公园");
            MBS.setText("滨海湾金沙");

            Ecp.setText("东海岸公园");
            Ubin.setText("乌敏岛");
            Museum.setText("国家博物馆");
            Science.setText("科学中心");
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "Website");
        menu.add(0, 1, 1, "Contact the Website");

        if (v == USS) {
            wordClicked = "Universal Studios";
        } else if (v == SEA) {
            wordClicked = "S.E.A Aqaurium";
        } else if (v == Zoo) {
            wordClicked = "Singapore Zoo";
        } else if (v == Safari) {
            wordClicked = "Night Safari";
        } else if (v == BirdPark) {
            wordClicked = "Jurong Bird Park";
        } else if (v == MBS) {
            wordClicked = "Marina Bay Sands";
        } else if (v == Ecp) {
            wordClicked = "East Coast Park";
        } else if (v == Ubin) {
            wordClicked = "Pulau Ubin";
        } else if (v == Museum) {
            wordClicked = "National Museum";
        } else if (v == Science) {
            wordClicked = "Science Centre";
        }
    }


        @Override
        public boolean onContextItemSelected (@NonNull MenuItem item)
        {
            if (item.getItemId() == 0) {

                if (wordClicked.equalsIgnoreCase("Universal Studios"))
                {
                    USS.setText("Universal Studios");
                    Uri uri = Uri.parse("https://www.rwsentosa.com/en/attractions/universal-studios-singapore/plan-your-visit");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }

                if (wordClicked.equalsIgnoreCase("S.E.A Aquarium"))
                {
                    SEA.setText("S.E.A Aquarium");
                    Uri uri2 = Uri.parse("https://www.rwsentosa.com/en/attractions/sea-aquarium/explore");
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                    startActivity(intent2);
                }

                if (wordClicked.equalsIgnoreCase("Singapore Zoo"))
                {
                    Zoo.setText("Singapore Zoo");
                    Uri uri3 = Uri.parse("https://www.wrs.com.sg/en/singapore-zoo/plan-your-visit.html");
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                    startActivity(intent3);
                }


                if (wordClicked.equalsIgnoreCase("Night Safari"))
                {
                    Safari.setText("Night Safari");
                    Uri uri4 = Uri.parse("https://www.wrs.com.sg/en/night-safari.html");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                }

                if (wordClicked.equalsIgnoreCase("Jurong Bird Park"))
                {
                    BirdPark.setText("Jurong Bird Park");
                    Uri uri5 = Uri.parse("https://www.wrs.com.sg/en/jurong-bird-park.html");
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                    startActivity(intent5);
                }

                if (wordClicked.equalsIgnoreCase("Marina Bay Sands"))
                {
                    MBS.setText("Marina Bay Sands");
                    Uri uri6 = Uri.parse("https://www.marinabaysands.com/");
                    Intent intent6 = new Intent(Intent.ACTION_VIEW, uri6);
                    startActivity(intent6);
                }

                if (wordClicked.equalsIgnoreCase("East Coast Park"))
                {
                    Ecp.setText("East Coast Park");
                    Uri uri7 = Uri.parse("https://www.nparks.gov.sg/gardens-parks-and-nature/parks-and-nature-reserves/east-coast-park");
                    Intent intent7 = new Intent(Intent.ACTION_VIEW, uri7);
                    startActivity(intent7);
                }


                if (wordClicked.equalsIgnoreCase("Pulau Ubin"))
                {
                    Ubin.setText("Pulau Ubin");
                    Uri uri8 = Uri.parse("https://www.visitsingapore.com/see-do-singapore/nature-wildlife/singapore-islands/pulau-ubin/");
                    Intent intent8 = new Intent(Intent.ACTION_VIEW, uri8);
                    startActivity(intent8);
                }


                if (wordClicked.equalsIgnoreCase("Natioanl Museum"))
                {
                    Museum.setText("Natioanl Museum");
                    Uri uri9 = Uri.parse("https://www.visitsingapore.com/see-do-singapore/history/history-museums/national-museum-of-singapore/");
                    Intent intent9 = new Intent(Intent.ACTION_VIEW, uri9);
                    startActivity(intent9);
                }

                if (wordClicked.equalsIgnoreCase("Science Centre"))
                {
                    Science.setText("Science Centre");
                    Uri uri10 = Uri.parse("https://www.science.edu.sg/");
                    Intent intent10 = new Intent(Intent.ACTION_VIEW, uri10);
                    startActivity(intent10);
                }

            }

            else if (item.getItemId() == 1)
            {
                if (wordClicked.equalsIgnoreCase("Universal Studios"))
                {
                    USS.setText("Universal Studios");
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:6577 8888"));
                    startActivity(intent);
                }

                if (wordClicked.equalsIgnoreCase("S.E.A Aquarium"))
                {
                    SEA.setText("S.E.A Aquarium");
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:6577 8888"));
                    startActivity(intent);
                }

                if (wordClicked.equalsIgnoreCase("Singapore Zoo"))
                {
                    Zoo.setText("Singapore Zoo");
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:62693411"));
                    startActivity(intent);
                    //intent.putExtra("Phone: ", 62693411);
                }

                if (wordClicked.equalsIgnoreCase("Night Safari"))
                {
                    USS.setText("Night Safari");
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:62693411"));
                    startActivity(intent);
                    //intent.putExtra("Phone: ", 62693411);
                }

                if (wordClicked.equalsIgnoreCase("Jurong Bird Park"))
                {
                    SEA.setText("Jurong Bird Park");
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:62693411"));
                    startActivity(intent);
                }

                if (wordClicked.equalsIgnoreCase("Marina Bay Sands"))
                {
                    Zoo.setText("Marina Bay Sands");
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:66888868"));
                    startActivity(intent);

                }


                if (wordClicked.equalsIgnoreCase("National Museum"))
                {
                    SEA.setText("National Museum");
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:63323659"));
                    startActivity(intent);

                }

                if (wordClicked.equalsIgnoreCase("Science Centre"))
                {
                    Zoo.setText("Science Centre");
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:64252500"));
                    startActivity(intent);

                }


            }


            return super.onContextItemSelected(item);
        }
    }

