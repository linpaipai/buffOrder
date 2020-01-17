package model;

public class GoodsBean {
        /**
         * appid : 570
         * buy_max_price : 7.1
         * description : null
         * game : dota2
         * goods_id : 759914
         * icon_url : https://g.fp.ps.netease.com/market/file/5caabbdf5e60276223043878yAJdw6ed02
         * item_id : null
         * market_hash_name : Glaive of Oscilla
         * market_min_price : 0
         * name : 珠辉旋刃
         * original_icon_url : https://g.fp.ps.netease.com/market/file/5b78d28396dee47d62a6054eVgVWV36J
         * steam_price : 1.9
         * steam_price_cny : 13.1
         * steam_price_custom : 1.9
         * tags : {"custom":{"category":"custom","internal_name":"ti8","localized_name":"ti8"},"hero":{"category":"hero","internal_name":"npc_dota_hero_silencer","localized_name":"沉默术士"},"quality":{"category":"quality","internal_name":"standard","localized_name":"普通"},"rarity":{"category":"rarity","internal_name":"immortal","localized_name":"不朽"},"slot":{"category":"slot","internal_name":"weapon","localized_name":"武器"},"type":{"category":"type","internal_name":"wearable","localized_name":"可佩带"}}
         */

        private int appid;
        private String buy_max_price;
        private Object description;
        private String game;
        private int goods_id;
        private String icon_url;
        private Object item_id;
        private String market_hash_name;
        private String market_min_price;
        private String name;
        private String original_icon_url;
        private String steam_price;
        private String steam_price_cny;
        private String steam_price_custom;
        private PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX tags;

        public int getAppid() {
        return appid;
    }

        public void setAppid(int appid) {
        this.appid = appid;
    }

        public String getBuy_max_price() {
        return buy_max_price;
    }

        public void setBuy_max_price(String buy_max_price) {
        this.buy_max_price = buy_max_price;
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

        public int getGoods_id() {
        return goods_id;
    }

        public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

        public String getIcon_url() {
        return icon_url;
    }

        public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

        public Object getItem_id() {
        return item_id;
    }

        public void setItem_id(Object item_id) {
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

        public String getSteam_price_custom() {
        return steam_price_custom;
    }

        public void setSteam_price_custom(String steam_price_custom) {
        this.steam_price_custom = steam_price_custom;
    }

        public PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX getTags() {
        return tags;
    }

        public void setTags(PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX tags) {
        this.tags = tags;
    }

        public static class TagsBeanXX {
            /**
             * custom : {"category":"custom","internal_name":"ti8","localized_name":"ti8"}
             * hero : {"category":"hero","internal_name":"npc_dota_hero_silencer","localized_name":"沉默术士"}
             * quality : {"category":"quality","internal_name":"standard","localized_name":"普通"}
             * rarity : {"category":"rarity","internal_name":"immortal","localized_name":"不朽"}
             * slot : {"category":"slot","internal_name":"weapon","localized_name":"武器"}
             * type : {"category":"type","internal_name":"wearable","localized_name":"可佩带"}
             */

            private PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.CustomBeanXX custom;
            private PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.HeroBeanXX hero;
            private PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.QualityBeanXX quality;
            private PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.RarityBeanXX rarity;
            private PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.SlotBeanXX slot;
            private PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.TypeBeanXX type;

            public PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.CustomBeanXX getCustom() {
                return custom;
            }

            public void setCustom(PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.CustomBeanXX custom) {
                this.custom = custom;
            }

            public PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.HeroBeanXX getHero() {
                return hero;
            }

            public void setHero(PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.HeroBeanXX hero) {
                this.hero = hero;
            }

            public PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.QualityBeanXX getQuality() {
                return quality;
            }

            public void setQuality(PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.QualityBeanXX quality) {
                this.quality = quality;
            }

            public PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.RarityBeanXX getRarity() {
                return rarity;
            }

            public void setRarity(PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.RarityBeanXX rarity) {
                this.rarity = rarity;
            }

            public PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.SlotBeanXX getSlot() {
                return slot;
            }

            public void setSlot(PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.SlotBeanXX slot) {
                this.slot = slot;
            }

            public PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.TypeBeanXX getType() {
                return type;
            }

            public void setType(PurchaseModel.DataBean.GoodsInfosBean.GoodsBean.TagsBeanXX.TypeBeanXX type) {
                this.type = type;
            }

            public static class CustomBeanXX {
                /**
                 * category : custom
                 * internal_name : ti8
                 * localized_name : ti8
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

            public static class HeroBeanXX {
                /**
                 * category : hero
                 * internal_name : npc_dota_hero_silencer
                 * localized_name : 沉默术士
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

            public static class QualityBeanXX {
                /**
                 * category : quality
                 * internal_name : standard
                 * localized_name : 普通
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

            public static class RarityBeanXX {
                /**
                 * category : rarity
                 * internal_name : immortal
                 * localized_name : 不朽
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

            public static class SlotBeanXX {
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

            public static class TypeBeanXX {
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
