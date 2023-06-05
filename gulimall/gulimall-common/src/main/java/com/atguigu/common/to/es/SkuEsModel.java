package com.atguigu.common.to.es;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * "properties": {
 *       "attrs": {
 *         "type": "nested",
 *         "properties": {
 *           "attrId": {
 *             "type": "long"
 *           },
 *           "attrName": {
 *             "type": "keyword",
 *             "index": false,
 *             "doc_values": false
 *           },
 *           "attrValue": {
 *             "type": "keyword"
 *           }
 *         }
 *       }
 *     }
 *   }
 */
@Data
public class SkuEsModel {

//    PUT product
//    {
//        "mappings": {
//        "properties": {
//            "skuId": {
//                "type": "long"
//            },
//            "spuId": {
//                "type": "keyword"
//            },
//            "skuTitle": {
//                "type": "text",
//                        "analyzer": "ik_smart"
//            },
//            "skuPrice": {
//                "type": "keyword"
//            },
//            "skuImg": {
//                "type": "keyword"
//            },
//            "saleCount": {
//                "type": "long"
//            },
//            "hasStock": {
//                "type": "boolean"
//            },
//            "hotScore": {
//                "type": "long"
//            },
//            "brandId": {
//                "type": "long"
//            },
//            "catalogId": {
//                "type": "long"
//            },
//            "brandName": {
//                "type": "keyword"
//            },
//            "brandImg": {
//                "type": "keyword"
//            },
//            "catalogName": {
//                "type": "keyword"
//            },
//            "attrs": {
//                "type": "nested",
//                        "properties": {
//                    "attrId": {
//                        "type": "long"
//                    },
//                    "attrName": {
//                        "type": "keyword"
//                    },
//                    "attrValue": {
//                        "type": "keyword"
//                    }
//                }
//            }
//        }
//    }
//    }
    private Long skuId;

    private Long spuId;

    private String skuTitle;

    private BigDecimal skuPrice;

    private String skuImg;

    private Long saleCount;

    private Boolean hasStock;

    private Long hotScore;

    private Long brandId;

    private Long catalogId;

    private String brandName;

    private String brandImg;

    private String catalogName;

    private List<Attrs> attrs;


    @Data
    public static class Attrs{

        private Long attrId;
        private String attrName;
        private String attrValue;
    }

}
