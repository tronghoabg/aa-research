package com.bykv.vk.openvk.preload.geckox.model;

import Va.M6;
import com.bykv.vk.openvk.preload.falconx.a.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes.dex */
public class UpdatePackage {
    private String accessKey;
    private String channel;
    private int channelIndex;
    private Content content;
    private String groupName;
    private long localVersion;
    private int packageType;
    private long version;

    public static class Content {
        private Package fullPackage;
        private Package patch;
        private Strategy strategy;

        public Content fromJson(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject;
            JSONObject jSONObjectOptJSONObject2;
            JSONObject jSONObjectOptJSONObject3;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("package") && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("package")) != null) {
                        Package r32 = new Package();
                        this.fullPackage = r32;
                        r32.fromJson(jSONObjectOptJSONObject3);
                    }
                    if (jSONObject.has("patch") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("patch")) != null) {
                        Package r22 = new Package();
                        this.patch = r22;
                        r22.fromJson(jSONObjectOptJSONObject2);
                    }
                    if (jSONObject.has("strategies") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("strategies")) != null) {
                        Strategy strategy = new Strategy();
                        this.strategy = strategy;
                        strategy.fromJson(jSONObjectOptJSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;
    }

    public static class Package {

        /* renamed from: id, reason: collision with root package name */
        long f24444id;
        long length;
        String md5;

        @Deprecated
        String url;
        List<String> urlList;

        public Package() {
        }

        public Package fromJson(JSONObject jSONObject) {
            JSONArray jSONArrayOptJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("id")) {
                        this.f24444id = jSONObject.optLong("id");
                    }
                    if (jSONObject.has("url")) {
                        this.url = (String) a.a(jSONObject, "url", String.class);
                    }
                    if (jSONObject.has("url_list") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("url_list")) != null && jSONArrayOptJSONArray.length() > 0) {
                        this.urlList = new ArrayList();
                        for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                            this.urlList.add(jSONArrayOptJSONArray.optString(i5));
                        }
                    }
                    if (jSONObject.has("md5")) {
                        this.md5 = (String) a.a(jSONObject, "md5", String.class);
                    }
                    if (jSONObject.has("size")) {
                        this.length = jSONObject.optLong("size");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }

        public long getId() {
            return this.f24444id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public void setId(int i5) {
            this.f24444id = i5;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Package{url='");
            sb2.append(this.url);
            sb2.append("', md5='");
            return b.c(sb2, this.md5, "'}");
        }

        public Package(int i5, List<String> list, String str) {
            this.f24444id = i5;
            this.urlList = list;
            this.md5 = str;
        }
    }

    public static class Strategy {
        private boolean deleteIfFail;
        private boolean deleteOldPackageBeforeDownload;
        private boolean needUnzip;

        public Strategy() {
        }

        public Strategy fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("del_if_download_failed")) {
                        this.deleteIfFail = jSONObject.optBoolean("del_if_download_failed");
                    }
                    if (jSONObject.has("del_old_pkg_before_download")) {
                        this.deleteOldPackageBeforeDownload = jSONObject.optBoolean("del_old_pkg_before_download");
                    }
                    if (jSONObject.has("need_unzip")) {
                        this.needUnzip = jSONObject.optBoolean("need_unzip");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(boolean z2) {
            this.deleteIfFail = z2;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z2) {
            this.deleteOldPackageBeforeDownload = z2;
        }

        public void setNeedUnzip(boolean z2) {
            this.needUnzip = z2;
        }

        public Strategy(int i5) {
            this.deleteIfFail = i5 == 1;
        }
    }

    public UpdatePackage() {
    }

    public UpdatePackage fromJson(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("group_name")) {
                    this.groupName = (String) a.a(jSONObject, "group_name", String.class);
                }
                if (jSONObject.has("channel_index")) {
                    this.channelIndex = jSONObject.optInt("channel_index");
                }
                if (jSONObject.has("package_version")) {
                    this.version = jSONObject.optLong("package_version");
                }
                if (jSONObject.has("channel")) {
                    this.channel = (String) a.a(jSONObject, "channel", String.class);
                }
                if (jSONObject.has("content") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("content")) != null) {
                    Content content = new Content();
                    this.content = content;
                    content.fromJson(jSONObjectOptJSONObject);
                }
                if (jSONObject.has("localVersion")) {
                    this.localVersion = jSONObject.optLong("localVersion");
                }
                if (jSONObject.has("accessKey")) {
                    this.accessKey = (String) a.a(jSONObject, "accessKey", String.class);
                }
                if (jSONObject.has("package_type")) {
                    this.packageType = jSONObject.optInt("package_type");
                }
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean isFullUpdate() {
        return getFullPackage() != null && getFullPackage().getUrlList().size() > 0;
    }

    public boolean isPatchUpdate() {
        return getPatch() != null && getPatch().getUrlList().size() > 0;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i5) {
        this.channelIndex = i5;
    }

    public void setFullPackage(Package r22) {
        this.content.fullPackage = r22;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j8) {
        this.localVersion = j8;
    }

    public void setPatch(Package r22) {
        this.content.patch = r22;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setVersion(long j8) {
        this.version = j8;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpdatePackage{version=");
        sb2.append(this.version);
        sb2.append(", channel='");
        sb2.append(this.channel);
        sb2.append("', content=");
        sb2.append(this.content);
        sb2.append(", packageType=");
        return M6.r(sb2, this.packageType, '}');
    }

    public UpdatePackage(long j8, String str, Package r42, Package r52) {
        this.version = j8;
        this.channel = str;
        Content content = new Content();
        this.content = content;
        content.fullPackage = r42;
        this.content.patch = r52;
    }
}
