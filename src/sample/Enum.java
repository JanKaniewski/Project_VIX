package sample;

public enum Enum {


    Jan19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-01-16"),
    Feb19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-02-13"),
    Mar19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-03-19"),
    Apr19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-04-17"),
    May19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-05-22"),
    Jun19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-06-19"),
    Jul19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-07-17"),
    Aug19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-08-21"),
    Sep19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-09-18"),
    Oct19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-10-16"),
    Nov19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-11-20"),
    Dec19   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2019-12-18"),
    Jan18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-01-17"),
    Feb18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-02-14"),
    Mar18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-03-21"),
    Apr18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-04-18"),
    May18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-05-16"),
    Jun18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-06-20"),
    Jul18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-07-18"),
    Aug18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-08-22"),
    Sep18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-09-19"),
    Oct18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-10-17"),
    Nov18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-11-21"),
    Dec18   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2018-12-19"),
    Jan17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-01-18"),
    Feb17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-02-15"),
    Mar17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-03-22"),
    Apr17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-04-19"),
    May17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-05-17"),
    Jun17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-06-21"),
    Jul17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-07-19"),
    Aug17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-08-16"),
    Sep17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-09-20"),
    Oct17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-10-18"),
    Nov17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-11-15"),
    Dec17   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2017-12-20"),
    Jan16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-01-20"),
    Feb16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-02-17"),
    Mar16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-03-16"),
    Apr16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-04-20"),
    May16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-05-18"),
    Jun16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-06-15"),
    Jul16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-07-20"),
    Aug16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-08-17"),
    Sep16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-09-21"),
    Oct16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-10-19"),
    Nov16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-11-16"),
    Dec16   ("https://markets.cboe.com/us/futures/market_statistics/historical_data/products/csv/VX/2016-12-21");


    private String link;

    Enum(String link) {
        this.link = link;
    }

     @Override
    public String toString(){
        return link;
    }

}
