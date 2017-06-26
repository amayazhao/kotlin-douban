package com.zhao.kotlin_douban.entity

/**
 * Created by zhao on 2017/6/17.
 */
class Movie {
    /**
     * rating : {"max":10,"average":7.5,"stars":"40","min":0}
     * genres : ["科幻","惊悚","恐怖"]
     * title : 异形：契约
     * casts : [{"alt":"https://movie.douban.com/celebrity/1000010/","avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/32214.jpg","large":"http://img7.doubanio.com/img/celebrity/large/32214.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/32214.jpg"},"name":"迈克尔·法斯宾德","id":"1000010"},{"alt":"https://movie.douban.com/celebrity/1316589/","avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/1474083107.3.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1474083107.3.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1474083107.3.jpg"},"name":"凯瑟琳·沃特斯顿","id":"1316589"},{"alt":"https://movie.douban.com/celebrity/1009265/","avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/1413531816.25.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1413531816.25.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1413531816.25.jpg"},"name":"比利·克鲁德普","id":"1009265"}]
     * collect_count : 24736
     * original_title : Alien: Covenant
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1054416/","avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/588.jpg","large":"http://img3.doubanio.com/img/celebrity/large/588.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/588.jpg"},"name":"雷德利·斯科特","id":"1054416"}]
     * year : 2017
     * images : {"small":"http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2459944375.jpg","large":"http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2459944375.jpg","medium":"http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2459944375.jpg"}
     * alt : https://movie.douban.com/subject/11803087/
     * id : 11803087
     */
    var rating: RatingBean? = null
    var title: String? = null
    var collect_count: Int = 0
    var original_title: String? = null
    var subtype: String? = null
    var year: String? = null
    var images: ImagesBean? = null
    var alt: String? = null
    var id: String? = null
    var genres: List<String>? = null
    var casts: List<CastsBean>? = null
    var directors: List<DirectorsBean>? = null

    class RatingBean {
        /**
         * max : 10
         * average : 7.5
         * stars : 40
         * min : 0
         */

        var max: Int = 0
        var average: Float = 0F
        var stars: String? = null
        var min: Int = 0
    }

    class ImagesBean {
        /**
         * small : http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2459944375.jpg
         * large : http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2459944375.jpg
         * medium : http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2459944375.jpg
         */

        var small: String? = null
        var large: String? = null
        var medium: String? = null
    }

    class CastsBean {
        /**
         * alt : https://movie.douban.com/celebrity/1000010/
         * avatars : {"small":"http://img7.doubanio.com/img/celebrity/small/32214.jpg","large":"http://img7.doubanio.com/img/celebrity/large/32214.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/32214.jpg"}
         * name : 迈克尔·法斯宾德
         * id : 1000010
         */

        var alt: String? = null
        var avatars: AvatarsBean? = null
        var name: String? = null
        var id: String? = null

        class AvatarsBean {
            /**
             * small : http://img7.doubanio.com/img/celebrity/small/32214.jpg
             * large : http://img7.doubanio.com/img/celebrity/large/32214.jpg
             * medium : http://img7.doubanio.com/img/celebrity/medium/32214.jpg
             */

            var small: String? = null
            var large: String? = null
            var medium: String? = null
        }
    }

    class DirectorsBean {
        /**
         * alt : https://movie.douban.com/celebrity/1054416/
         * avatars : {"small":"http://img3.doubanio.com/img/celebrity/small/588.jpg","large":"http://img3.doubanio.com/img/celebrity/large/588.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/588.jpg"}
         * name : 雷德利·斯科特
         * id : 1054416
         */

        var alt: String? = null
        var avatars: AvatarsBeanX? = null
        var name: String? = null
        var id: String? = null

        class AvatarsBeanX {
            /**
             * small : http://img3.doubanio.com/img/celebrity/small/588.jpg
             * large : http://img3.doubanio.com/img/celebrity/large/588.jpg
             * medium : http://img3.doubanio.com/img/celebrity/medium/588.jpg
             */
            var small: String? = null
            var large: String? = null
            var medium: String? = null
        }
    }
}
