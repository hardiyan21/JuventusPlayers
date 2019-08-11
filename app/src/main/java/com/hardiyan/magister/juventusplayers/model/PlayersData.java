package com.hardiyan.magister.juventusplayers.model;

import java.util.ArrayList;

public class PlayersData {
    private static String[][] data = new String[][]{
            {"Paulo Dybala", "Forward", "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2019/04/17/1509734672.jpg"},
            {"Adrien Rabiot", "Midfielder", "https://i2.wp.com/metro.co.uk/wp-content/uploads/2019/04/GettyImages-1046684370.jpg?quality=90&strip=all&zoom=1&resize=644%2C430&ssl=1"},
            {"Leonardo Bonucci", "Defender", "https://i2-prod.manchestereveningnews.co.uk/sport/article15864724.ece/ALTERNATES/s615/0_GettyImages-1125064911.jpg"},
            {"Aaron Ramsey", "Midfielder", "https://e0.365dm.com/18/05/800x600/skysports-ramsey-aaron-arsenal_4323883.jpg?20180716150658"},
            {"Luca Pellegrini", "Defender", "https://cdn2.tstatic.net/makassar/foto/bank/images/luca-pellegrini-1.jpg"},
            {"Cristiano Ronaldo", "Forward", "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2019/05/21/3174890232.jpg"},
            {"Alex Sandro", "Defender", "https://cdn.images.express.co.uk/img/dynamic/67/590x/Alex-Sandro-844982.jpg"},
            {"Matthijs de Ligt", "Defender", "https://e1.365dm.com/18/01/768x432/ajax-matthijs-de-ligt-lyon_4208224.jpg?20180118090834"},
            {"Federico Bernardeschi", "Midfielder", "https://www.thesportsman.com/media/images/admin/football/PA-31839071.webp"},
            {"Juan Cuadrado", "Midfielder", "https://cdn.images.express.co.uk/img/dynamic/67/590x/Arsenal-news-Juan-Cuadrado-857344.jpg"},
            {"Gianluigi Buffon", "Goalkeeper", "https://cdn.images.express.co.uk/img/dynamic/143/590x/Gianluigi-Buffon-World-of-Tanks-954832.jpg"},
    };

    public static ArrayList<Player> getListData(){
        ArrayList<Player> list = new ArrayList<>();
        for (String [] aData : data) {
            Player player = new Player();
            player.setName(aData[0]);
            player.setFrom(aData[1]);
            player.setPhoto(aData[2]);

            list.add(player);
        }

        return list;
    }
}
