package model;

import java.util.List;

public class GoodDetailBean {


    /**
     * code : OK
     * data : {"appid":570,"asset_tags":[{"depth":2,"items":[{"category":"gem_inscribed","items":[{"category":"gem_inscribed","id":1628673,"name":"摧毁兵营数"},{"category":"gem_inscribed","id":1831956,"name":"摧毁防御塔"},{"category":"gem_inscribed","id":2712109,"name":"摧毁建筑数"},{"category":"gem_inscribed","id":31613,"name":"花费金钱"},{"category":"gem_inscribed","id":256402,"name":"获得金钱"},{"category":"gem_inscribed","id":31611,"name":"击杀"},{"category":"gem_inscribed","id":240888,"name":"击杀Roshan次数"},{"category":"gem_inscribed","id":1778132,"name":"击杀肉山次数"},{"category":"gem_inscribed","id":92063,"name":"末日降临敌人次数"},{"category":"gem_inscribed","id":112271,"name":"拿下第一滴血"},{"category":"gem_inscribed","id":84945,"name":"如神杀戮次数"},{"category":"gem_inscribed","id":5778265,"name":"撒粉发现敌人次数"},{"category":"gem_inscribed","id":251861,"name":"胜利"},{"category":"gem_inscribed","id":1423523,"name":"守卫购买数"},{"category":"gem_inscribed","id":31612,"name":"小兵吞噬总数"},{"category":"gem_inscribed","id":493095,"name":"已放置守卫"},{"category":"gem_inscribed","id":21058,"name":"中过末日的敌人数"},{"category":"gem_inscribed","id":3659915,"name":"助攻"}],"name":"铭刻宝石"},{"category":"gem_kinetic","items":[{"category":"gem_kinetic","id":7666,"name":"霸主雄姿"},{"category":"gem_kinetic","id":24189,"name":"焚焰之火"},{"category":"gem_kinetic","id":24190,"name":"魔狱霸主！"},{"category":"gem_kinetic","id":24191,"name":"无尽魔渊"},{"category":"gem_kinetic","id":50414,"name":"远行之宝！"}],"name":"动能宝石"}],"name":"宝石筛选","type":"gems"}],"asset_tags_history":[],"bookmarked":false,"buy_max_price":"94","buy_num":9,"can_buy":true,"description":null,"game":"dota2","goods_info":{"can_inspect":false,"can_preview":true,"can_preview_upload":true,"can_search_by_sticker":false,"can_specific_buy":true,"icon_url":"https://g.fp.ps.netease.com/market/file/5a0ea829143cfae7da01c69128GqySmL","info":{"tags":{"hero":{"category":"hero","internal_name":"npc_dota_hero_doom_bringer","localized_name":"末日使者"},"rarity":{"category":"rarity","internal_name":"rare","localized_name":"稀有"},"slot":{"category":"slot","internal_name":"weapon","localized_name":"武器"},"type":{"category":"type","internal_name":"wearable","localized_name":"可佩带"}}},"item_id":6873,"normal_icon_url":"https://g.fp.ps.netease.com/market/file/5a0ea829143cfae7da01c69128GqySmL","original_icon_url":"https://g.fp.ps.netease.com/market/file/599293bf96dee43ed35919ad3BBGz7SR","specific":[],"steam_price":"28.02","steam_price_cny":"193.37"},"has_buff_price_history":true,"has_paintwear_rank":false,"has_related":false,"id":12682,"item_id":"6873","market_hash_name":"Genuine Burning Fiend","market_min_price":"0","name":"纯正 炎魔","paintseed_filters":[],"paintseed_filters_history":[],"quick_price":"98.2","rank_types":[],"recent_sold_count":0,"relative_goods":[],"sell_min_price":"98.3","sell_num":54,"sell_reference_price":"98.3","share_data":{"content":"时下流行的CSGO、DOTA2饰品交易平台，交易快，安全","thumbnail":"https://g.fp.ps.netease.com/market/file/5d5132775e6027705c379517FMGwikj902","title":"纯正 炎魔","url":"https://buff.163.com/s/goods.html?goods_id=12682&game=dota2"},"sort_by_fields":{"list":[{"attribute":"sort_by","default_value":"default","list":[{"title":"默认","value":"default"},{"title":"最新上架","value":"created.desc"},{"title":"价格↑","value":"price.asc"},{"title":"价格↓","value":"price.desc"}]}],"title":"排序"},"steam_market_url":"https://steamcommunity.com/market/listings/570/Genuine%20Burning%20Fiend","transacted_num":0,"user_show_count":19,"wiki_link":"https://buff.163.com/dota2/m/item?item_id=6873"}
     * msg : null
     */

    private String code;
    private DataBean data;
    private Object msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * appid : 570
         * asset_tags : [{"depth":2,"items":[{"category":"gem_inscribed","items":[{"category":"gem_inscribed","id":1628673,"name":"摧毁兵营数"},{"category":"gem_inscribed","id":1831956,"name":"摧毁防御塔"},{"category":"gem_inscribed","id":2712109,"name":"摧毁建筑数"},{"category":"gem_inscribed","id":31613,"name":"花费金钱"},{"category":"gem_inscribed","id":256402,"name":"获得金钱"},{"category":"gem_inscribed","id":31611,"name":"击杀"},{"category":"gem_inscribed","id":240888,"name":"击杀Roshan次数"},{"category":"gem_inscribed","id":1778132,"name":"击杀肉山次数"},{"category":"gem_inscribed","id":92063,"name":"末日降临敌人次数"},{"category":"gem_inscribed","id":112271,"name":"拿下第一滴血"},{"category":"gem_inscribed","id":84945,"name":"如神杀戮次数"},{"category":"gem_inscribed","id":5778265,"name":"撒粉发现敌人次数"},{"category":"gem_inscribed","id":251861,"name":"胜利"},{"category":"gem_inscribed","id":1423523,"name":"守卫购买数"},{"category":"gem_inscribed","id":31612,"name":"小兵吞噬总数"},{"category":"gem_inscribed","id":493095,"name":"已放置守卫"},{"category":"gem_inscribed","id":21058,"name":"中过末日的敌人数"},{"category":"gem_inscribed","id":3659915,"name":"助攻"}],"name":"铭刻宝石"},{"category":"gem_kinetic","items":[{"category":"gem_kinetic","id":7666,"name":"霸主雄姿"},{"category":"gem_kinetic","id":24189,"name":"焚焰之火"},{"category":"gem_kinetic","id":24190,"name":"魔狱霸主！"},{"category":"gem_kinetic","id":24191,"name":"无尽魔渊"},{"category":"gem_kinetic","id":50414,"name":"远行之宝！"}],"name":"动能宝石"}],"name":"宝石筛选","type":"gems"}]
         * asset_tags_history : []
         * bookmarked : false
         * buy_max_price : 94
         * buy_num : 9
         * can_buy : true
         * description : null
         * game : dota2
         * goods_info : {"can_inspect":false,"can_preview":true,"can_preview_upload":true,"can_search_by_sticker":false,"can_specific_buy":true,"icon_url":"https://g.fp.ps.netease.com/market/file/5a0ea829143cfae7da01c69128GqySmL","info":{"tags":{"hero":{"category":"hero","internal_name":"npc_dota_hero_doom_bringer","localized_name":"末日使者"},"rarity":{"category":"rarity","internal_name":"rare","localized_name":"稀有"},"slot":{"category":"slot","internal_name":"weapon","localized_name":"武器"},"type":{"category":"type","internal_name":"wearable","localized_name":"可佩带"}}},"item_id":6873,"normal_icon_url":"https://g.fp.ps.netease.com/market/file/5a0ea829143cfae7da01c69128GqySmL","original_icon_url":"https://g.fp.ps.netease.com/market/file/599293bf96dee43ed35919ad3BBGz7SR","specific":[],"steam_price":"28.02","steam_price_cny":"193.37"}
         * has_buff_price_history : true
         * has_paintwear_rank : false
         * has_related : false
         * id : 12682
         * item_id : 6873
         * market_hash_name : Genuine Burning Fiend
         * market_min_price : 0
         * name : 纯正 炎魔
         * paintseed_filters : []
         * paintseed_filters_history : []
         * quick_price : 98.2
         * rank_types : []
         * recent_sold_count : 0
         * relative_goods : []
         * sell_min_price : 98.3
         * sell_num : 54
         * sell_reference_price : 98.3
         * share_data : {"content":"时下流行的CSGO、DOTA2饰品交易平台，交易快，安全","thumbnail":"https://g.fp.ps.netease.com/market/file/5d5132775e6027705c379517FMGwikj902","title":"纯正 炎魔","url":"https://buff.163.com/s/goods.html?goods_id=12682&game=dota2"}
         * sort_by_fields : {"list":[{"attribute":"sort_by","default_value":"default","list":[{"title":"默认","value":"default"},{"title":"最新上架","value":"created.desc"},{"title":"价格↑","value":"price.asc"},{"title":"价格↓","value":"price.desc"}]}],"title":"排序"}
         * steam_market_url : https://steamcommunity.com/market/listings/570/Genuine%20Burning%20Fiend
         * transacted_num : 0
         * user_show_count : 19
         * wiki_link : https://buff.163.com/dota2/m/item?item_id=6873
         */

        private int appid;
        private boolean bookmarked;
        private String buy_max_price;
        private int buy_num;
        private boolean can_buy;
        private Object description;
        private String game;
        private GoodsInfoBean goods_info;
        private boolean has_buff_price_history;
        private boolean has_paintwear_rank;
        private boolean has_related;
        private int id;
        private String item_id;
        private String market_hash_name;
        private String market_min_price;
        private String name;
        private String quick_price;
        private int recent_sold_count;
        private String sell_min_price;
        private int sell_num;
        private String sell_reference_price;
        private ShareDataBean share_data;
        private SortByFieldsBean sort_by_fields;
        private String steam_market_url;
        private int transacted_num;
        private int user_show_count;
        private String wiki_link;
        private List<AssetTagsBean> asset_tags;
        private List<?> asset_tags_history;
        private List<?> paintseed_filters;
        private List<?> paintseed_filters_history;
        private List<?> rank_types;
        private List<?> relative_goods;

        public int getAppid() {
            return appid;
        }

        public void setAppid(int appid) {
            this.appid = appid;
        }

        public boolean isBookmarked() {
            return bookmarked;
        }

        public void setBookmarked(boolean bookmarked) {
            this.bookmarked = bookmarked;
        }

        public String getBuy_max_price() {
            return buy_max_price;
        }

        public void setBuy_max_price(String buy_max_price) {
            this.buy_max_price = buy_max_price;
        }

        public int getBuy_num() {
            return buy_num;
        }

        public void setBuy_num(int buy_num) {
            this.buy_num = buy_num;
        }

        public boolean isCan_buy() {
            return can_buy;
        }

        public void setCan_buy(boolean can_buy) {
            this.can_buy = can_buy;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getGame() {
            return game;
        }

        public void setGame(String game) {
            this.game = game;
        }

        public GoodsInfoBean getGoods_info() {
            return goods_info;
        }

        public void setGoods_info(GoodsInfoBean goods_info) {
            this.goods_info = goods_info;
        }

        public boolean isHas_buff_price_history() {
            return has_buff_price_history;
        }

        public void setHas_buff_price_history(boolean has_buff_price_history) {
            this.has_buff_price_history = has_buff_price_history;
        }

        public boolean isHas_paintwear_rank() {
            return has_paintwear_rank;
        }

        public void setHas_paintwear_rank(boolean has_paintwear_rank) {
            this.has_paintwear_rank = has_paintwear_rank;
        }

        public boolean isHas_related() {
            return has_related;
        }

        public void setHas_related(boolean has_related) {
            this.has_related = has_related;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getItem_id() {
            return item_id;
        }

        public void setItem_id(String item_id) {
            this.item_id = item_id;
        }

        public String getMarket_hash_name() {
            return market_hash_name;
        }

        public void setMarket_hash_name(String market_hash_name) {
            this.market_hash_name = market_hash_name;
        }

        public String getMarket_min_price() {
            return market_min_price;
        }

        public void setMarket_min_price(String market_min_price) {
            this.market_min_price = market_min_price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getQuick_price() {
            return quick_price;
        }

        public void setQuick_price(String quick_price) {
            this.quick_price = quick_price;
        }

        public int getRecent_sold_count() {
            return recent_sold_count;
        }

        public void setRecent_sold_count(int recent_sold_count) {
            this.recent_sold_count = recent_sold_count;
        }

        public String getSell_min_price() {
            return sell_min_price;
        }

        public void setSell_min_price(String sell_min_price) {
            this.sell_min_price = sell_min_price;
        }

        public int getSell_num() {
            return sell_num;
        }

        public void setSell_num(int sell_num) {
            this.sell_num = sell_num;
        }

        public String getSell_reference_price() {
            return sell_reference_price;
        }

        public void setSell_reference_price(String sell_reference_price) {
            this.sell_reference_price = sell_reference_price;
        }

        public ShareDataBean getShare_data() {
            return share_data;
        }

        public void setShare_data(ShareDataBean share_data) {
            this.share_data = share_data;
        }

        public SortByFieldsBean getSort_by_fields() {
            return sort_by_fields;
        }

        public void setSort_by_fields(SortByFieldsBean sort_by_fields) {
            this.sort_by_fields = sort_by_fields;
        }

        public String getSteam_market_url() {
            return steam_market_url;
        }

        public void setSteam_market_url(String steam_market_url) {
            this.steam_market_url = steam_market_url;
        }

        public int getTransacted_num() {
            return transacted_num;
        }

        public void setTransacted_num(int transacted_num) {
            this.transacted_num = transacted_num;
        }

        public int getUser_show_count() {
            return user_show_count;
        }

        public void setUser_show_count(int user_show_count) {
            this.user_show_count = user_show_count;
        }

        public String getWiki_link() {
            return wiki_link;
        }

        public void setWiki_link(String wiki_link) {
            this.wiki_link = wiki_link;
        }

        public List<AssetTagsBean> getAsset_tags() {
            return asset_tags;
        }

        public void setAsset_tags(List<AssetTagsBean> asset_tags) {
            this.asset_tags = asset_tags;
        }

        public List<?> getAsset_tags_history() {
            return asset_tags_history;
        }

        public void setAsset_tags_history(List<?> asset_tags_history) {
            this.asset_tags_history = asset_tags_history;
        }

        public List<?> getPaintseed_filters() {
            return paintseed_filters;
        }

        public void setPaintseed_filters(List<?> paintseed_filters) {
            this.paintseed_filters = paintseed_filters;
        }

        public List<?> getPaintseed_filters_history() {
            return paintseed_filters_history;
        }

        public void setPaintseed_filters_history(List<?> paintseed_filters_history) {
            this.paintseed_filters_history = paintseed_filters_history;
        }

        public List<?> getRank_types() {
            return rank_types;
        }

        public void setRank_types(List<?> rank_types) {
            this.rank_types = rank_types;
        }

        public List<?> getRelative_goods() {
            return relative_goods;
        }

        public void setRelative_goods(List<?> relative_goods) {
            this.relative_goods = relative_goods;
        }

        public static class GoodsInfoBean {
            /**
             * can_inspect : false
             * can_preview : true
             * can_preview_upload : true
             * can_search_by_sticker : false
             * can_specific_buy : true
             * icon_url : https://g.fp.ps.netease.com/market/file/5a0ea829143cfae7da01c69128GqySmL
             * info : {"tags":{"hero":{"category":"hero","internal_name":"npc_dota_hero_doom_bringer","localized_name":"末日使者"},"rarity":{"category":"rarity","internal_name":"rare","localized_name":"稀有"},"slot":{"category":"slot","internal_name":"weapon","localized_name":"武器"},"type":{"category":"type","internal_name":"wearable","localized_name":"可佩带"}}}
             * item_id : 6873
             * normal_icon_url : https://g.fp.ps.netease.com/market/file/5a0ea829143cfae7da01c69128GqySmL
             * original_icon_url : https://g.fp.ps.netease.com/market/file/599293bf96dee43ed35919ad3BBGz7SR
             * specific : []
             * steam_price : 28.02
             * steam_price_cny : 193.37
             */

            private boolean can_inspect;
            private boolean can_preview;
            private boolean can_preview_upload;
            private boolean can_search_by_sticker;
            private boolean can_specific_buy;
            private String icon_url;
            private InfoBean info;
            private int item_id;
            private String normal_icon_url;
            private String original_icon_url;
            private String steam_price;
            private String steam_price_cny;
            private List<?> specific;

            public boolean isCan_inspect() {
                return can_inspect;
            }

            public void setCan_inspect(boolean can_inspect) {
                this.can_inspect = can_inspect;
            }

            public boolean isCan_preview() {
                return can_preview;
            }

            public void setCan_preview(boolean can_preview) {
                this.can_preview = can_preview;
            }

            public boolean isCan_preview_upload() {
                return can_preview_upload;
            }

            public void setCan_preview_upload(boolean can_preview_upload) {
                this.can_preview_upload = can_preview_upload;
            }

            public boolean isCan_search_by_sticker() {
                return can_search_by_sticker;
            }

            public void setCan_search_by_sticker(boolean can_search_by_sticker) {
                this.can_search_by_sticker = can_search_by_sticker;
            }

            public boolean isCan_specific_buy() {
                return can_specific_buy;
            }

            public void setCan_specific_buy(boolean can_specific_buy) {
                this.can_specific_buy = can_specific_buy;
            }

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }

            public InfoBean getInfo() {
                return info;
            }

            public void setInfo(InfoBean info) {
                this.info = info;
            }

            public int getItem_id() {
                return item_id;
            }

            public void setItem_id(int item_id) {
                this.item_id = item_id;
            }

            public String getNormal_icon_url() {
                return normal_icon_url;
            }

            public void setNormal_icon_url(String normal_icon_url) {
                this.normal_icon_url = normal_icon_url;
            }

            public String getOriginal_icon_url() {
                return original_icon_url;
            }

            public void setOriginal_icon_url(String original_icon_url) {
                this.original_icon_url = original_icon_url;
            }

            public String getSteam_price() {
                return steam_price;
            }

            public void setSteam_price(String steam_price) {
                this.steam_price = steam_price;
            }

            public String getSteam_price_cny() {
                return steam_price_cny;
            }

            public void setSteam_price_cny(String steam_price_cny) {
                this.steam_price_cny = steam_price_cny;
            }

            public List<?> getSpecific() {
                return specific;
            }

            public void setSpecific(List<?> specific) {
                this.specific = specific;
            }

            public static class InfoBean {
                /**
                 * tags : {"hero":{"category":"hero","internal_name":"npc_dota_hero_doom_bringer","localized_name":"末日使者"},"rarity":{"category":"rarity","internal_name":"rare","localized_name":"稀有"},"slot":{"category":"slot","internal_name":"weapon","localized_name":"武器"},"type":{"category":"type","internal_name":"wearable","localized_name":"可佩带"}}
                 */

                private TagsBean tags;

                public TagsBean getTags() {
                    return tags;
                }

                public void setTags(TagsBean tags) {
                    this.tags = tags;
                }

                public static class TagsBean {
                    /**
                     * hero : {"category":"hero","internal_name":"npc_dota_hero_doom_bringer","localized_name":"末日使者"}
                     * rarity : {"category":"rarity","internal_name":"rare","localized_name":"稀有"}
                     * slot : {"category":"slot","internal_name":"weapon","localized_name":"武器"}
                     * type : {"category":"type","internal_name":"wearable","localized_name":"可佩带"}
                     */

                    private HeroBean hero;
                    private RarityBean rarity;
                    private SlotBean slot;
                    private TypeBean type;

                    public HeroBean getHero() {
                        return hero;
                    }

                    public void setHero(HeroBean hero) {
                        this.hero = hero;
                    }

                    public RarityBean getRarity() {
                        return rarity;
                    }

                    public void setRarity(RarityBean rarity) {
                        this.rarity = rarity;
                    }

                    public SlotBean getSlot() {
                        return slot;
                    }

                    public void setSlot(SlotBean slot) {
                        this.slot = slot;
                    }

                    public TypeBean getType() {
                        return type;
                    }

                    public void setType(TypeBean type) {
                        this.type = type;
                    }

                    public static class HeroBean {
                        /**
                         * category : hero
                         * internal_name : npc_dota_hero_doom_bringer
                         * localized_name : 末日使者
                         */

                        private String category;
                        private String internal_name;
                        private String localized_name;

                        public String getCategory() {
                            return category;
                        }

                        public void setCategory(String category) {
                            this.category = category;
                        }

                        public String getInternal_name() {
                            return internal_name;
                        }

                        public void setInternal_name(String internal_name) {
                            this.internal_name = internal_name;
                        }

                        public String getLocalized_name() {
                            return localized_name;
                        }

                        public void setLocalized_name(String localized_name) {
                            this.localized_name = localized_name;
                        }
                    }

                    public static class RarityBean {
                        /**
                         * category : rarity
                         * internal_name : rare
                         * localized_name : 稀有
                         */

                        private String category;
                        private String internal_name;
                        private String localized_name;

                        public String getCategory() {
                            return category;
                        }

                        public void setCategory(String category) {
                            this.category = category;
                        }

                        public String getInternal_name() {
                            return internal_name;
                        }

                        public void setInternal_name(String internal_name) {
                            this.internal_name = internal_name;
                        }

                        public String getLocalized_name() {
                            return localized_name;
                        }

                        public void setLocalized_name(String localized_name) {
                            this.localized_name = localized_name;
                        }
                    }

                    public static class SlotBean {
                        /**
                         * category : slot
                         * internal_name : weapon
                         * localized_name : 武器
                         */

                        private String category;
                        private String internal_name;
                        private String localized_name;

                        public String getCategory() {
                            return category;
                        }

                        public void setCategory(String category) {
                            this.category = category;
                        }

                        public String getInternal_name() {
                            return internal_name;
                        }

                        public void setInternal_name(String internal_name) {
                            this.internal_name = internal_name;
                        }

                        public String getLocalized_name() {
                            return localized_name;
                        }

                        public void setLocalized_name(String localized_name) {
                            this.localized_name = localized_name;
                        }
                    }

                    public static class TypeBean {
                        /**
                         * category : type
                         * internal_name : wearable
                         * localized_name : 可佩带
                         */

                        private String category;
                        private String internal_name;
                        private String localized_name;

                        public String getCategory() {
                            return category;
                        }

                        public void setCategory(String category) {
                            this.category = category;
                        }

                        public String getInternal_name() {
                            return internal_name;
                        }

                        public void setInternal_name(String internal_name) {
                            this.internal_name = internal_name;
                        }

                        public String getLocalized_name() {
                            return localized_name;
                        }

                        public void setLocalized_name(String localized_name) {
                            this.localized_name = localized_name;
                        }
                    }
                }
            }
        }

        public static class ShareDataBean {
            /**
             * content : 时下流行的CSGO、DOTA2饰品交易平台，交易快，安全
             * thumbnail : https://g.fp.ps.netease.com/market/file/5d5132775e6027705c379517FMGwikj902
             * title : 纯正 炎魔
             * url : https://buff.163.com/s/goods.html?goods_id=12682&game=dota2
             */

            private String content;
            private String thumbnail;
            private String title;
            private String url;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class SortByFieldsBean {
            /**
             * list : [{"attribute":"sort_by","default_value":"default","list":[{"title":"默认","value":"default"},{"title":"最新上架","value":"created.desc"},{"title":"价格↑","value":"price.asc"},{"title":"价格↓","value":"price.desc"}]}]
             * title : 排序
             */

            private String title;
            private List<ListBeanX> list;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<ListBeanX> getList() {
                return list;
            }

            public void setList(List<ListBeanX> list) {
                this.list = list;
            }

            public static class ListBeanX {
                /**
                 * attribute : sort_by
                 * default_value : default
                 * list : [{"title":"默认","value":"default"},{"title":"最新上架","value":"created.desc"},{"title":"价格↑","value":"price.asc"},{"title":"价格↓","value":"price.desc"}]
                 */

                private String attribute;
                private String default_value;
                private List<ListBean> list;

                public String getAttribute() {
                    return attribute;
                }

                public void setAttribute(String attribute) {
                    this.attribute = attribute;
                }

                public String getDefault_value() {
                    return default_value;
                }

                public void setDefault_value(String default_value) {
                    this.default_value = default_value;
                }

                public List<ListBean> getList() {
                    return list;
                }

                public void setList(List<ListBean> list) {
                    this.list = list;
                }

                public static class ListBean {
                    /**
                     * title : 默认
                     * value : default
                     */

                    private String title;
                    private String value;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }
            }
        }

        public static class AssetTagsBean {
            /**
             * depth : 2
             * items : [{"category":"gem_inscribed","items":[{"category":"gem_inscribed","id":1628673,"name":"摧毁兵营数"},{"category":"gem_inscribed","id":1831956,"name":"摧毁防御塔"},{"category":"gem_inscribed","id":2712109,"name":"摧毁建筑数"},{"category":"gem_inscribed","id":31613,"name":"花费金钱"},{"category":"gem_inscribed","id":256402,"name":"获得金钱"},{"category":"gem_inscribed","id":31611,"name":"击杀"},{"category":"gem_inscribed","id":240888,"name":"击杀Roshan次数"},{"category":"gem_inscribed","id":1778132,"name":"击杀肉山次数"},{"category":"gem_inscribed","id":92063,"name":"末日降临敌人次数"},{"category":"gem_inscribed","id":112271,"name":"拿下第一滴血"},{"category":"gem_inscribed","id":84945,"name":"如神杀戮次数"},{"category":"gem_inscribed","id":5778265,"name":"撒粉发现敌人次数"},{"category":"gem_inscribed","id":251861,"name":"胜利"},{"category":"gem_inscribed","id":1423523,"name":"守卫购买数"},{"category":"gem_inscribed","id":31612,"name":"小兵吞噬总数"},{"category":"gem_inscribed","id":493095,"name":"已放置守卫"},{"category":"gem_inscribed","id":21058,"name":"中过末日的敌人数"},{"category":"gem_inscribed","id":3659915,"name":"助攻"}],"name":"铭刻宝石"},{"category":"gem_kinetic","items":[{"category":"gem_kinetic","id":7666,"name":"霸主雄姿"},{"category":"gem_kinetic","id":24189,"name":"焚焰之火"},{"category":"gem_kinetic","id":24190,"name":"魔狱霸主！"},{"category":"gem_kinetic","id":24191,"name":"无尽魔渊"},{"category":"gem_kinetic","id":50414,"name":"远行之宝！"}],"name":"动能宝石"}]
             * name : 宝石筛选
             * type : gems
             */

            private int depth;
            private String name;
            private String type;
            private List<ItemsBeanX> items;

            public int getDepth() {
                return depth;
            }

            public void setDepth(int depth) {
                this.depth = depth;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<ItemsBeanX> getItems() {
                return items;
            }

            public void setItems(List<ItemsBeanX> items) {
                this.items = items;
            }

            public static class ItemsBeanX {
                /**
                 * category : gem_inscribed
                 * items : [{"category":"gem_inscribed","id":1628673,"name":"摧毁兵营数"},{"category":"gem_inscribed","id":1831956,"name":"摧毁防御塔"},{"category":"gem_inscribed","id":2712109,"name":"摧毁建筑数"},{"category":"gem_inscribed","id":31613,"name":"花费金钱"},{"category":"gem_inscribed","id":256402,"name":"获得金钱"},{"category":"gem_inscribed","id":31611,"name":"击杀"},{"category":"gem_inscribed","id":240888,"name":"击杀Roshan次数"},{"category":"gem_inscribed","id":1778132,"name":"击杀肉山次数"},{"category":"gem_inscribed","id":92063,"name":"末日降临敌人次数"},{"category":"gem_inscribed","id":112271,"name":"拿下第一滴血"},{"category":"gem_inscribed","id":84945,"name":"如神杀戮次数"},{"category":"gem_inscribed","id":5778265,"name":"撒粉发现敌人次数"},{"category":"gem_inscribed","id":251861,"name":"胜利"},{"category":"gem_inscribed","id":1423523,"name":"守卫购买数"},{"category":"gem_inscribed","id":31612,"name":"小兵吞噬总数"},{"category":"gem_inscribed","id":493095,"name":"已放置守卫"},{"category":"gem_inscribed","id":21058,"name":"中过末日的敌人数"},{"category":"gem_inscribed","id":3659915,"name":"助攻"}]
                 * name : 铭刻宝石
                 */

                private String category;
                private String name;
                private List<ItemsBean> items;

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public static class ItemsBean {
                    /**
                     * category : gem_inscribed
                     * id : 1628673
                     * name : 摧毁兵营数
                     */

                    private String category;
                    private int id;
                    private String name;

                    public String getCategory() {
                        return category;
                    }

                    public void setCategory(String category) {
                        this.category = category;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }
    }
}
