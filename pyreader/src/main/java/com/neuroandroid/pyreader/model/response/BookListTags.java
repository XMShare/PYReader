package com.neuroandroid.pyreader.model.response;

import com.neuroandroid.pyreader.base.BaseResponse;

import java.util.List;

/**
 * Created by NeuroAndroid on 2017/7/5.
 */

public class BookListTags extends BaseResponse {
    /**
     * data : [{"name":"时空","tags":["都市","古代","科幻","架空","重生","未来","穿越","历史","快穿","末世","异界位面"]},
     * {"name":"情感","tags":["纯爱","热血","言情","现言","古言","情有独钟","搞笑","青春","欢喜冤家","爽文","虐文"]},
     * {"name":"流派","tags":["变身","悬疑","系统","网游","推理","玄幻","武侠","仙侠","恐怖","奇幻","洪荒","犯罪","百合",
     * "种田","惊悚","轻小说","技术流","耽美","竞技","无限"]},{"name":"人设","tags":["同人","娱乐明星","女强","帝王","职场",
     * "女配","网配","火影","金庸","豪门","扮猪吃虎","谋士","特种兵","教师"]}]
     * ok : true
     */
    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String name;
        private List<String> tags;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }
    }
}
