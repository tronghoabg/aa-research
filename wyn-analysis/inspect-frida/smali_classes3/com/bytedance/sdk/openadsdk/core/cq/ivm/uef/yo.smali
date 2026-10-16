.class public Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;
.super Lcom/bytedance/sdk/openadsdk/core/ivm/yo;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/ugeno/core/ab;
.implements Lcom/bytedance/adsdk/ugeno/core/wk;


# static fields
.field private static oa:I = 0x18

.field private static yo:Ljava/lang/Boolean;


# instance fields
.field private bcc:F

.field private cq:F

.field private cz:F

.field private dj:F

.field private dz:F

.field private ivm:F

.field private lw:J

.field private final moa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

.field public uef:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;",
            ">;"
        }
    .end annotation
.end field

.field private wrv:F

.field private xs:F

.field private zjm:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->oa()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->oa:I

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Z)V
    .locals 11

    .line 1
    const-string v0, "xSetting"

    .line 2
    .line 3
    const-string v1, "endcard_text"

    .line 4
    .line 5
    iget-object v2, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {p0, v2}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->uef:Landroid/util/SparseArray;

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->lw:J

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->zjm:Z

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    iput v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->dj:F

    .line 26
    .line 27
    iput v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->wrv:F

    .line 28
    .line 29
    iput v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->cq:F

    .line 30
    .line 31
    iput v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->dz:F

    .line 32
    .line 33
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 34
    .line 35
    iget v3, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->etd:I

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    const/4 v5, 0x0

    .line 39
    if-ne v3, v4, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v2, v5

    .line 43
    :goto_0
    if-eqz p2, :cond_2

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 48
    .line 49
    const-string v4, "{\"meta\":{},\"body\":{\"width\":\"match_parent\",\"flexDirection\":\"column\",\"alignItems\":\"center\",\"backgroundColor\":\"#000000\",\"children\":[{\"width\":\"wrap_content\",\"flexDirection\":\"column\",\"type\":\"CustomComponent\",\"height\":\"wrap_content\",\"alignItems\":\"flex_start\",\"components\":[],\"targetId\":\"100000219\",\"id\":\"4f7070\",\"targetProps\":{}},{\"alignItems\":\"flex_start\",\"components\":[\"100000220\"],\"targetId\":\"100000220\",\"id\":\"55c956\",\"targetProps\":{},\"type\":\"CustomComponent\",\"flexDirection\":\"column\",\"width\":\"match_parent\",\"height\":\"match_parent\"},{\"height\":\"wrap_content\",\"position\":\"absolute\",\"alignItems\":\"flex_start\",\"components\":[],\"targetProps\":{},\"type\":\"CustomComponent\",\"left\":16,\"id\":\"b32492\",\"flexDirection\":\"column\",\"targetId\":\"100000017\",\"bottom\":16,\"width\":\"wrap_content\"}],\"justifyContent\":\"center\",\"id\":\"af1349\",\"type\":\"View\",\"height\":\"match_parent\"}}"

    .line 50
    .line 51
    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v4, Lorg/json/JSONObject;

    .line 55
    .line 56
    const-string v6, "{\"100000017\":\"{\\\"id\\\":\\\"c16458\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"24c093\\\",\\\"type\\\":\\\"Icon\\\",\\\"width\\\":14,\\\"height\\\":6,\\\"src\\\":\\\"${\'logo\'}\\\",\\\"textColor\\\":\\\"rgba(255,255,255,0.5)\\\",\\\"visibility\\\":\\\"${ad_label == null ?  \'visible\' : (ad_label.icon == null || ad_label.icon == \'\' ? \'hidden\':\'visible\')}\\\"},{\\\"id\\\":\\\"bbbbe1\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${ad_label == null || ad_label.text == null || ad_label.text == \'\' ? \'AD\' : ad_label.text }\\\",\\\"textSize\\\":10,\\\"textColor\\\":\\\"rgba(255,255,255,0.75)\\\",\\\"marginLeft\\\":2,\\\"scaleX\\\":0.8,\\\"scaleY\\\":0.8,\\\"visibility\\\":\\\"visible\\\"}],\\\"justifyContent\\\":\\\"center\\\",\\\"borderRadius\\\":2,\\\"paddingTop\\\":1,\\\"paddingBottom\\\":1,\\\"paddingLeft\\\":2,\\\"paddingRight\\\":2,\\\"backgroundColor\\\":\\\"rgba(0,0,0,0.15)\\\",\\\"visibility\\\":\\\"${\'visible\'}\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://openPrivacy\\\"]}]}\",\"100000219\":\"{\\\"id\\\":\\\"c9a5ce\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\"}\",\"100000220\":\"{\\\"id\\\":\\\"f05ccd\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"36f6ef\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #ffc145 10%, #ec36bd 100%)\\\",\\\"borderRadius\\\":16,\\\"ratio\\\":1.44,\\\"justifyContent\\\":\\\"space_between\\\",\\\"padding\\\":15,\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"c5a71f\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"9ff3d5\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.0.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"height\\\":80,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"borderRadius\\\":12},{\\\"id\\\":\\\"0a80ee\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"33338b\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"marginBottom\\\":8,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"minTextSize\\\":14},{\\\"id\\\":\\\"e5cbc5\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.title}\\\",\\\"maxLines\\\":2,\\\"textSize\\\":13,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"marginBottom\\\":10,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"minTextSize\\\":12},{\\\"id\\\":\\\"ce0dd8\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"marginTop\\\":8,\\\"justifyContent\\\":\\\"center\\\"}],\\\"visibility\\\":\\\"${xSetting.showAdCount<=1?\'visible\':\'hidden\'}\\\",\\\"height\\\":\\\"match_parent\\\"},{\\\"id\\\":\\\"7bbeb6\\\",\\\"type\\\":\\\"View\\\",\\\"children\\\":[{\\\"id\\\":\\\"f69705\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"borderRadius\\\":16,\\\"ratio\\\":1.44,\\\"justifyContent\\\":\\\"space_between\\\",\\\"padding\\\":15,\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #02c3bd 20%, #4e148c 100%)\\\",\\\"flexGrow\\\":1,\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"3293d2\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"a6d827\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.0.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"height\\\":80,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"borderRadius\\\":12},{\\\"id\\\":\\\"ac691f\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"2a0b51\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"marginBottom\\\":8,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"minTextSize\\\":14},{\\\"id\\\":\\\"2cece0\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.title}\\\",\\\"maxLines\\\":2,\\\"textSize\\\":13,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"marginBottom\\\":12,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"minTextSize\\\":12},{\\\"id\\\":\\\"de7ee0\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"marginTop\\\":8,\\\"justifyContent\\\":\\\"center\\\"}]},{\\\"id\\\":\\\"52adfa\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #ffc145 10%, #ec36bd 100%)\\\",\\\"borderRadius\\\":16,\\\"ratio\\\":1.44,\\\"justifyContent\\\":\\\"space_between\\\",\\\"padding\\\":15,\\\"marginLeft\\\":8,\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"dc55b7\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"59d978\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.1.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"height\\\":80,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"borderRadius\\\":12},{\\\"id\\\":\\\"6f9b50\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"75dca1\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.1.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"marginBottom\\\":8,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}],\\\"minTextSize\\\":14},{\\\"id\\\":\\\"7e9b93\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.1.title}\\\",\\\"maxLines\\\":2,\\\"textSize\\\":13,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"marginBottom\\\":12,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}],\\\"minTextSize\\\":12},{\\\"id\\\":\\\"8d5b48\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"marginTop\\\":8,\\\"justifyContent\\\":\\\"center\\\"}],\\\"height\\\":\\\"match_parent\\\"}],\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"position\\\":\\\"absolute\\\",\\\"height\\\":\\\"match_parent\\\",\\\"width\\\":\\\"match_parent\\\",\\\"padding\\\":75,\\\"top\\\":0,\\\"bottom\\\":0,\\\"left\\\":0,\\\"right\\\":0,\\\"visibility\\\":\\\"${xSetting.showAdCount==2?\'visible\':\'hidden\'}\\\"},{\\\"id\\\":\\\"06c1e0\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"3d4d81\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #02c3bd 20%, #4e148c 100%)\\\",\\\"borderRadius\\\":16,\\\"ratio\\\":6,\\\"justifyContent\\\":\\\"center\\\",\\\"padding\\\":16,\\\"height\\\":111,\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"fed92d\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"9c3139\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.0.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"height\\\":54,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"borderRadius\\\":12,\\\"flexShrink\\\":0},{\\\"id\\\":\\\"5656bb\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"434950\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"minTextSize\\\":15,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"visibility\\\":\\\"${sub_ads.0.app_name==null || sub_ads.0.app_name==\'\'?\'hidden\':\'visible\'}\\\"},{\\\"id\\\":\\\"d4dad0\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.title}\\\",\\\"maxLines\\\":2,\\\"textSize\\\":14,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"marginTop\\\":8,\\\"minTextSize\\\":13,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"visibility\\\":\\\"${sub_ads.0.title==null || sub_ads.0.title==\'\'?\'hidden\':\'visible\'}\\\"}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"marginLeft\\\":8,\\\"marginRight\\\":8},{\\\"id\\\":\\\"33ff6d\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"flexShrink\\\":0,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}]}]},{\\\"id\\\":\\\"a4d2c9\\\",\\\"type\\\":\\\"View\\\",\\\"children\\\":[{\\\"id\\\":\\\"821fe7\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"borderRadius\\\":16,\\\"justifyContent\\\":\\\"flex_start\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"padding\\\":16,\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #414288 0%, #b0db43 100%)\\\",\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"c3e536\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"27547d\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.1.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"height\\\":54,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"borderRadius\\\":12,\\\"flexShrink\\\":0,\\\"justifyContent\\\":\\\"flex_start\\\"},{\\\"id\\\":\\\"eea4ea\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"58615a\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.1.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"minTextSize\\\":15,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}],\\\"visibility\\\":\\\"${sub_ads.0.app_name==null || sub_ads.0.app_name==\'\'?\'hidden\':\'visible\'}\\\"},{\\\"id\\\":\\\"ee6f16\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.1.title}\\\",\\\"maxLines\\\":1,\\\"textSize\\\":14,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"ellipsis\\\":\\\"end\\\",\\\"marginTop\\\":8,\\\"minTextSize\\\":13,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}],\\\"visibility\\\":\\\"${sub_ads.0.title==null || sub_ads.0.title==\'\'?\'hidden\':\'visible\'}\\\"}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"marginLeft\\\":8,\\\"marginRight\\\":8},{\\\"id\\\":\\\"7c5f1e\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"maxLines\\\":1,\\\"flexShrink\\\":0,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}]}]},{\\\"id\\\":\\\"584a23\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #ffc145 10%, #ec36bd 100%)\\\",\\\"borderRadius\\\":16,\\\"justifyContent\\\":\\\"flex_start\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"padding\\\":16,\\\"marginLeft\\\":8,\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"a40f83\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"b6f879\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.2.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"height\\\":54,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=2\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"borderRadius\\\":12,\\\"flexShrink\\\":0},{\\\"id\\\":\\\"594018\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"121189\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.2.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"minTextSize\\\":15,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=2\\\"]}],\\\"visibility\\\":\\\"${sub_ads.0.app_name==null || sub_ads.0.app_name==\'\'?\'hidden\':\'visible\'}\\\"},{\\\"id\\\":\\\"cd5b72\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.2.title}\\\",\\\"maxLines\\\":1,\\\"textSize\\\":14,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"ellipsis\\\":\\\"end\\\",\\\"marginTop\\\":8,\\\"minTextSize\\\":13,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=2\\\"]}],\\\"visibility\\\":\\\"${sub_ads.0.title==null || sub_ads.0.title==\'\'?\'hidden\':\'visible\'}\\\"}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"marginLeft\\\":8,\\\"justifyContent\\\":\\\"center\\\",\\\"marginRight\\\":8},{\\\"id\\\":\\\"8a7d88\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"maxLines\\\":1,\\\"flexShrink\\\":0,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=2\\\"]}]}]}],\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"space_between\\\",\\\"ratio\\\":6.16,\\\"marginTop\\\":8,\\\"flexGrow\\\":1,\\\"height\\\":109}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"position\\\":\\\"absolute\\\",\\\"visibility\\\":\\\"${xSetting.showAdCount>=3?\'visible\':\'hidden\'}\\\",\\\"top\\\":0,\\\"bottom\\\":0,\\\"left\\\":0,\\\"right\\\":0}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"padding\\\":75}\"}"

    .line 57
    .line 58
    invoke-direct {v4, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    new-instance v3, Lorg/json/JSONObject;

    .line 63
    .line 64
    const-string v4, "{\"meta\":{},\"body\":{\"width\":\"match_parent\",\"type\":\"View\",\"alignItems\":\"center\",\"justifyContent\":\"center\",\"id\":\"32e938\",\"height\":\"match_parent\",\"flexDirection\":\"column\",\"children\":[{\"targetId\":\"100000219\",\"width\":\"wrap_content\",\"height\":\"wrap_content\",\"components\":[\"100000005\"],\"id\":\"6584f9\",\"type\":\"CustomComponent\",\"alignItems\":\"flex_start\",\"targetProps\":{},\"flexDirection\":\"column\"},{\"alignItems\":\"flex_start\",\"components\":[\"100000216\"],\"type\":\"CustomComponent\",\"height\":\"match_parent\",\"id\":\"757617\",\"targetId\":\"100000216\",\"targetProps\":{},\"width\":\"match_parent\",\"flexDirection\":\"column\"},{\"type\":\"CustomComponent\",\"position\":\"absolute\",\"id\":\"024619\",\"alignItems\":\"flex_start\",\"targetProps\":{},\"bottom\":16,\"left\":16,\"width\":\"wrap_content\",\"targetId\":\"100000017\",\"flexDirection\":\"column\",\"components\":[\"100000017\"],\"height\":\"wrap_content\"}],\"backgroundColor\":\"#000000\"}}"

    .line 65
    .line 66
    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance v4, Lorg/json/JSONObject;

    .line 70
    .line 71
    const-string v6, "{\"100000017\":\"{\\\"id\\\":\\\"c16458\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"24c093\\\",\\\"type\\\":\\\"Icon\\\",\\\"width\\\":14,\\\"height\\\":6,\\\"src\\\":\\\"${\'logo\'}\\\",\\\"textColor\\\":\\\"rgba(255,255,255,0.5)\\\",\\\"visibility\\\":\\\"${ad_label == null ?  \'visible\' : (ad_label.icon == null || ad_label.icon == \'\' ? \'hidden\':\'visible\')}\\\"},{\\\"id\\\":\\\"bbbbe1\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${ad_label == null || ad_label.text == null || ad_label.text == \'\' ? \'AD\' : ad_label.text }\\\",\\\"textSize\\\":10,\\\"textColor\\\":\\\"rgba(255,255,255,0.75)\\\",\\\"marginLeft\\\":2,\\\"scaleX\\\":0.8,\\\"scaleY\\\":0.8,\\\"visibility\\\":\\\"visible\\\"}],\\\"justifyContent\\\":\\\"center\\\",\\\"borderRadius\\\":2,\\\"paddingTop\\\":1,\\\"paddingBottom\\\":1,\\\"paddingLeft\\\":2,\\\"paddingRight\\\":2,\\\"backgroundColor\\\":\\\"rgba(0,0,0,0.15)\\\",\\\"visibility\\\":\\\"${\'visible\'}\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://openPrivacy\\\"]}]}\",\"100000216\":\"{\\\"id\\\":\\\"d8374c\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"1ebdfe\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #ffc145 10%, #ec36bd 100%)\\\",\\\"borderRadius\\\":16,\\\"ratio\\\":1.2,\\\"justifyContent\\\":\\\"space_between\\\",\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"7b688c\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"626d16\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.0.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"height\\\":80}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"paddingLeft\\\":16,\\\"paddingTop\\\":16,\\\"borderRadius\\\":12},{\\\"id\\\":\\\"da4ddb\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"42c865\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"marginBottom\\\":8,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"minTextSize\\\":15},{\\\"id\\\":\\\"a4eaac\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.title}\\\",\\\"maxLines\\\":3,\\\"textSize\\\":13,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"marginBottom\\\":16,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"minTextSize\\\":12},{\\\"id\\\":\\\"097ab9\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"paddingBottom\\\":16,\\\"paddingLeft\\\":16,\\\"paddingRight\\\":16}],\\\"visibility\\\":\\\"${xSetting.showAdCount<=1?\'visible\':\'hidden\'}\\\"},{\\\"id\\\":\\\"4bddc3\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"926380\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #02c3bd 20%, #4e148c 100%)\\\",\\\"borderRadius\\\":16,\\\"ratio\\\":1.2,\\\"justifyContent\\\":\\\"space_between\\\",\\\"marginBottom\\\":8,\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"a6baad\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"f9aa86\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.0.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"height\\\":80}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"paddingLeft\\\":16,\\\"paddingTop\\\":16,\\\"borderRadius\\\":12},{\\\"id\\\":\\\"a9d7e6\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"7bd7ed\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"marginBottom\\\":8,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"minTextSize\\\":15},{\\\"id\\\":\\\"653ccf\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.title}\\\",\\\"maxLines\\\":3,\\\"textSize\\\":13,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"marginBottom\\\":16,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"minTextSize\\\":12},{\\\"id\\\":\\\"1e27a8\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"paddingBottom\\\":16,\\\"paddingLeft\\\":16,\\\"paddingRight\\\":16}]},{\\\"id\\\":\\\"e9f96c\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #ffc145 10%, #ec36bd 100%)\\\",\\\"borderRadius\\\":16,\\\"ratio\\\":1.2,\\\"justifyContent\\\":\\\"space_between\\\",\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"24c3ff\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"394274\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.1.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"height\\\":80,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"paddingLeft\\\":16,\\\"paddingTop\\\":16,\\\"borderRadius\\\":12},{\\\"id\\\":\\\"a290b0\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"581d96\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.1.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"marginBottom\\\":8,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}],\\\"minTextSize\\\":15},{\\\"id\\\":\\\"02c759\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.1.title}\\\",\\\"maxLines\\\":3,\\\"textSize\\\":13,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"marginBottom\\\":16,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}],\\\"minTextSize\\\":12},{\\\"id\\\":\\\"e772b8\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"paddingBottom\\\":16,\\\"paddingLeft\\\":16,\\\"paddingRight\\\":16}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"position\\\":\\\"absolute\\\",\\\"paddingLeft\\\":16,\\\"paddingRight\\\":16,\\\"paddingTop\\\":80,\\\"paddingBottom\\\":80,\\\"visibility\\\":\\\"${xSetting.showAdCount==2?\'visible\':\'hidden\'}\\\",\\\"top\\\":0,\\\"bottom\\\":0,\\\"left\\\":0,\\\"right\\\":0},{\\\"id\\\":\\\"532ef3\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"5fb245\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #02c3bd 20%, #4e148c 100%)\\\",\\\"borderRadius\\\":16,\\\"justifyContent\\\":\\\"space_between\\\",\\\"height\\\":\\\"match_parent\\\",\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"eb77dd\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"e91c55\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.0.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"height\\\":80}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"paddingLeft\\\":16,\\\"paddingTop\\\":16,\\\"borderRadius\\\":12},{\\\"id\\\":\\\"1c3074\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"4e95a5\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"marginBottom\\\":8,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"minTextSize\\\":15},{\\\"id\\\":\\\"9fd991\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.0.title}\\\",\\\"maxLines\\\":3,\\\"textSize\\\":13,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"marginBottom\\\":16,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}],\\\"minTextSize\\\":12},{\\\"id\\\":\\\"8c0924\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=0\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"paddingBottom\\\":16,\\\"paddingLeft\\\":16,\\\"paddingRight\\\":16}]},{\\\"id\\\":\\\"8c1317\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"2462bc\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #e57a44 10%, #251351 100%)\\\",\\\"borderRadius\\\":16,\\\"justifyContent\\\":\\\"space_between\\\",\\\"marginRight\\\":8,\\\"padding\\\":16,\\\"height\\\":\\\"match_parent\\\",\\\"width\\\":\\\"match_parent\\\",\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"9a515b\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"4e6606\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.1.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}],\\\"height\\\":80}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"borderRadius\\\":12},{\\\"id\\\":\\\"a13ef9\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"3cf231\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.1.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"marginBottom\\\":8,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}],\\\"minTextSize\\\":15},{\\\"id\\\":\\\"c243f4\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.1.title}\\\",\\\"maxLines\\\":2,\\\"textSize\\\":13,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"marginBottom\\\":16,\\\"ellipsis\\\":\\\"end\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}],\\\"minTextSize\\\":12},{\\\"id\\\":\\\"53997d\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=1\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\"}]},{\\\"id\\\":\\\"48c77d\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"backgroundColor\\\":\\\"linear-gradient(135deg, #ffc145 10%, #ec36bd 100%)\\\",\\\"borderRadius\\\":16,\\\"justifyContent\\\":\\\"space_between\\\",\\\"padding\\\":16,\\\"height\\\":\\\"match_parent\\\",\\\"width\\\":\\\"match_parent\\\",\\\"flexGrow\\\":1,\\\"children\\\":[{\\\"id\\\":\\\"1a91b9\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"652e4e\\\",\\\"type\\\":\\\"Image\\\",\\\"src\\\":\\\"${sub_ads.2.icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=2\\\"]}],\\\"height\\\":80}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\",\\\"borderRadius\\\":12},{\\\"id\\\":\\\"9e2704\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"children\\\":[{\\\"id\\\":\\\"36c473\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.2.app_name}\\\",\\\"maxLines\\\":2,\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":600,\\\"marginBottom\\\":8,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=2\\\"]}],\\\"minTextSize\\\":15},{\\\"id\\\":\\\"52e404\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${sub_ads.2.title}\\\",\\\"maxLines\\\":2,\\\"textSize\\\":13,\\\"fontWeight\\\":400,\\\"textColor\\\":\\\"#ffffff\\\",\\\"marginBottom\\\":16,\\\"ellipsis\\\":\\\"end\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=2\\\"]}],\\\"minTextSize\\\":12},{\\\"id\\\":\\\"64aa5e\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"textSize\\\":14,\\\"fontWeight\\\":600,\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.12)\\\",\\\"paddingBottom\\\":8,\\\"paddingTop\\\":8,\\\"paddingLeft\\\":12,\\\"paddingRight\\\":12,\\\"borderRadius\\\":18,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert?adIndex=2\\\"]}]}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\"}]}],\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"space_between\\\",\\\"marginTop\\\":8,\\\"height\\\":\\\"match_parent\\\"}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"position\\\":\\\"absolute\\\",\\\"paddingLeft\\\":16,\\\"paddingRight\\\":16,\\\"height\\\":\\\"match_parent\\\",\\\"paddingTop\\\":80,\\\"paddingBottom\\\":80,\\\"visibility\\\":\\\"${xSetting.showAdCount>=3?\'visible\':\'hidden\'}\\\",\\\"top\\\":0,\\\"bottom\\\":0,\\\"left\\\":0,\\\"right\\\":0}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"paddingLeft\\\":16,\\\"paddingRight\\\":16,\\\"paddingTop\\\":80,\\\"paddingBottom\\\":80}\",\"100000219\":\"{\\\"id\\\":\\\"c9a5ce\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\"}\"}"

    .line 72
    .line 73
    invoke-direct {v4, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    if-eqz v2, :cond_3

    .line 78
    .line 79
    new-instance v3, Lorg/json/JSONObject;

    .line 80
    .line 81
    const-string v4, "{\"meta\":{},\"body\":{\"flexDirection\":\"column\",\"alignItems\":\"center\",\"children\":[{\"id\":\"5fe84f\",\"width\":\"wrap_content\",\"alignItems\":\"flex_start\",\"components\":[\"100000005\"],\"height\":\"wrap_content\",\"targetId\":\"100000005\",\"targetProps\":{},\"type\":\"CustomComponent\",\"flexDirection\":\"column\"},{\"type\":\"CustomComponent\",\"width\":\"wrap_content\",\"id\":\"10303e\",\"components\":[\"100000222\"],\"flexDirection\":\"column\",\"height\":\"match_parent\",\"alignItems\":\"center\",\"targetId\":\"100000222\",\"targetProps\":{},\"justifyContent\":\"center\"},{\"targetId\":\"100000017\",\"type\":\"CustomComponent\",\"position\":\"absolute\",\"bottom\":16,\"height\":\"wrap_content\",\"targetProps\":{},\"width\":\"wrap_content\",\"alignItems\":\"flex_start\",\"left\":16,\"id\":\"4262da\",\"flexDirection\":\"column\",\"components\":[\"100000017\"]}],\"backgroundImage\":\"images/0f6bedd4b4ad0d4924424b213064ffac.jpg\",\"id\":\"d3ec1a\",\"type\":\"View\",\"width\":\"match_parent\",\"height\":\"match_parent\"}}"

    .line 82
    .line 83
    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Lorg/json/JSONObject;

    .line 87
    .line 88
    const-string v6, "{\"100000005\":\"{\\\"id\\\":\\\"27e0ff\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\"}\",\"100000017\":\"{\\\"id\\\":\\\"c16458\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"24c093\\\",\\\"type\\\":\\\"Icon\\\",\\\"width\\\":14,\\\"height\\\":6,\\\"src\\\":\\\"${\'logo\'}\\\",\\\"textColor\\\":\\\"rgba(255,255,255,0.5)\\\",\\\"visibility\\\":\\\"${ad_label == null ?  \'visible\' : (ad_label.icon == null || ad_label.icon == \'\' ? \'hidden\':\'visible\')}\\\"},{\\\"id\\\":\\\"bbbbe1\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${ad_label == null || ad_label.text == null || ad_label.text == \'\' ? \'AD\' : ad_label.text }\\\",\\\"textSize\\\":10,\\\"textColor\\\":\\\"rgba(255,255,255,0.75)\\\",\\\"marginLeft\\\":2,\\\"scaleX\\\":0.8,\\\"scaleY\\\":0.8,\\\"visibility\\\":\\\"visible\\\"}],\\\"justifyContent\\\":\\\"center\\\",\\\"borderRadius\\\":2,\\\"paddingTop\\\":1,\\\"paddingBottom\\\":1,\\\"paddingLeft\\\":2,\\\"paddingRight\\\":2,\\\"backgroundColor\\\":\\\"rgba(0,0,0,0.15)\\\",\\\"visibility\\\":\\\"${\'visible\'}\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://openPrivacy\\\"]}]}\",\"100000222\":\"{\\\"id\\\":\\\"bfd404\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"children\\\":[{\\\"id\\\":\\\"2edfbe\\\",\\\"type\\\":\\\"View\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"870289\\\",\\\"type\\\":\\\"Image\\\",\\\"width\\\":80,\\\"src\\\":\\\"${icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"borderWidth\\\":1,\\\"borderColor\\\":\\\"rgba(0,0,0,0.08)\\\"},{\\\"id\\\":\\\"71a636\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${app_name}\\\",\\\"textSize\\\":24,\\\"fontWeight\\\":500,\\\"maxLines\\\":2,\\\"ellipsis\\\":\\\"end\\\",\\\"textAlign\\\":\\\"center\\\",\\\"textColor\\\":\\\"#161823\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"marginTop\\\":12,\\\"minTextSize\\\":22},{\\\"id\\\":\\\"b5bea5\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${title}\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":400,\\\"maxLines\\\":3,\\\"textAlign\\\":\\\"center\\\",\\\"ellipsis\\\":\\\"end\\\",\\\"textColor\\\":\\\"rgba(22,24,35,0.5)\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"marginTop\\\":8,\\\"minTextSize\\\":14},{\\\"id\\\":\\\"d66663\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":500,\\\"maxLines\\\":1,\\\"ellipsis\\\":\\\"end\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"borderRadius\\\":8,\\\"padding\\\":10,\\\"backgroundColor\\\":\\\"#1a73e8\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"marginTop\\\":20}],\\\"backgroundColor\\\":\\\"#ffffff\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"ratio\\\":1.08,\\\"height\\\":\\\"match_parent\\\",\\\"paddingLeft\\\":24,\\\"paddingRight\\\":24}],\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"justifyContent\\\":\\\"center\\\"}\"}"

    .line 89
    .line 90
    invoke-direct {v4, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    new-instance v3, Lorg/json/JSONObject;

    .line 95
    .line 96
    const-string v4, "{\"meta\":{},\"body\":{\"backgroundColor\":\"#ffffff\",\"type\":\"View\",\"height\":\"match_parent\",\"flexDirection\":\"column\",\"children\":[{\"alignItems\":\"flex_start\",\"id\":\"f02f41\",\"width\":\"wrap_content\",\"components\":[\"100000005\"],\"targetId\":\"100000005\",\"height\":\"wrap_content\",\"flexDirection\":\"column\",\"targetProps\":{},\"type\":\"CustomComponent\"},{\"targetId\":\"100000017\",\"position\":\"absolute\",\"flexDirection\":\"column\",\"alignItems\":\"flex_start\",\"bottom\":16,\"left\":16,\"width\":\"wrap_content\",\"components\":[\"100000017\"],\"targetProps\":{},\"id\":\"087504\",\"type\":\"CustomComponent\",\"height\":\"wrap_content\"},{\"targetId\":\"100000221\",\"justifyContent\":\"center\",\"alignItems\":\"flex_start\",\"components\":[\"100000221\"],\"type\":\"CustomComponent\",\"flexDirection\":\"column\",\"animation\":{\"duration\":500,\"timingFunction\":\"ease_in\",\"effect\":{\"start\":0,\"type\":\"stretch\",\"direction\":\"center\"},\"playState\":1},\"targetProps\":{},\"id\":\"6a3d8f\",\"width\":\"match_parent\",\"height\":\"wrap_content\"}],\"id\":\"c9982e\",\"width\":\"match_parent\",\"alignItems\":\"center\",\"justifyContent\":\"center\",\"backgroundImage\":\"images/32ef2f913cdd873fd3625237372054d6.jpg\"}}"

    .line 97
    .line 98
    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance v4, Lorg/json/JSONObject;

    .line 102
    .line 103
    const-string v6, "{\"100000005\":\"{\\\"id\\\":\\\"27e0ff\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"flex_start\\\"}\",\"100000017\":\"{\\\"id\\\":\\\"c16458\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"flexDirection\\\":\\\"row\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"24c093\\\",\\\"type\\\":\\\"Icon\\\",\\\"width\\\":14,\\\"height\\\":6,\\\"src\\\":\\\"${\'logo\'}\\\",\\\"textColor\\\":\\\"rgba(255,255,255,0.5)\\\",\\\"visibility\\\":\\\"${ad_label == null ?  \'visible\' : (ad_label.icon == null || ad_label.icon == \'\' ? \'hidden\':\'visible\')}\\\"},{\\\"id\\\":\\\"bbbbe1\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"wrap_content\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${ad_label == null || ad_label.text == null || ad_label.text == \'\' ? \'AD\' : ad_label.text }\\\",\\\"textSize\\\":10,\\\"textColor\\\":\\\"rgba(255,255,255,0.75)\\\",\\\"marginLeft\\\":2,\\\"scaleX\\\":0.8,\\\"scaleY\\\":0.8,\\\"visibility\\\":\\\"visible\\\"}],\\\"justifyContent\\\":\\\"center\\\",\\\"borderRadius\\\":2,\\\"paddingTop\\\":1,\\\"paddingBottom\\\":1,\\\"paddingLeft\\\":2,\\\"paddingRight\\\":2,\\\"backgroundColor\\\":\\\"rgba(0,0,0,0.15)\\\",\\\"visibility\\\":\\\"${\'visible\'}\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://openPrivacy\\\"]}]}\",\"100000221\":\"{\\\"id\\\":\\\"985c2a\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"39c2e9\\\",\\\"type\\\":\\\"View\\\",\\\"width\\\":\\\"match_parent\\\",\\\"flexDirection\\\":\\\"column\\\",\\\"alignItems\\\":\\\"center\\\",\\\"children\\\":[{\\\"id\\\":\\\"7844d8\\\",\\\"type\\\":\\\"Image\\\",\\\"width\\\":80,\\\"src\\\":\\\"${icon}\\\",\\\"flexShrink\\\":0,\\\"ratio\\\":1,\\\"borderRadius\\\":12,\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"borderColor\\\":\\\"rgba(0,0,0,0.08)\\\",\\\"borderWidth\\\":1},{\\\"id\\\":\\\"fcbebb\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${app_name}\\\",\\\"textSize\\\":24,\\\"fontWeight\\\":500,\\\"maxLines\\\":2,\\\"ellipsis\\\":\\\"end\\\",\\\"textAlign\\\":\\\"center\\\",\\\"textColor\\\":\\\"#161823\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"marginTop\\\":12,\\\"minTextSize\\\":22},{\\\"id\\\":\\\"62a9b1\\\",\\\"type\\\":\\\"Text\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${title}\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":400,\\\"maxLines\\\":3,\\\"textAlign\\\":\\\"center\\\",\\\"ellipsis\\\":\\\"end\\\",\\\"textColor\\\":\\\"rgba(22,24,35,0.5)\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"marginTop\\\":8,\\\"minTextSize\\\":14},{\\\"id\\\":\\\"587c73\\\",\\\"type\\\":\\\"Button\\\",\\\"width\\\":\\\"match_parent\\\",\\\"height\\\":\\\"wrap_content\\\",\\\"text\\\":\\\"${endcard_text}\\\",\\\"textSize\\\":16,\\\"fontWeight\\\":500,\\\"maxLines\\\":1,\\\"ellipsis\\\":\\\"end\\\",\\\"textColor\\\":\\\"#ffffff\\\",\\\"borderRadius\\\":8,\\\"padding\\\":10,\\\"backgroundColor\\\":\\\"#1a73e8\\\",\\\"events\\\":[{\\\"on\\\":\\\"tap\\\",\\\"handlers\\\":[\\\"global://convert\\\"]}],\\\"marginTop\\\":20}],\\\"backgroundColor\\\":\\\"rgba(255,255,255,0.9)\\\",\\\"justifyContent\\\":\\\"center\\\",\\\"ratio\\\":1.09,\\\"paddingLeft\\\":24,\\\"paddingRight\\\":24}],\\\"backgroundColor\\\":\\\"rgba(255,255,255,0)\\\",\\\"justifyContent\\\":\\\"center\\\"}\"}"

    .line 104
    .line 105
    invoke-direct {v4, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :goto_1
    iget v6, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->rj:I

    .line 109
    .line 110
    int-to-float v6, v6

    .line 111
    iget v7, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dv:I

    .line 112
    .line 113
    int-to-float v7, v7

    .line 114
    iget-object v8, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 115
    .line 116
    invoke-virtual {v8}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-static {v6, v7, v2, v8, v9}, Lcom/bytedance/sdk/openadsdk/core/zjm/oa/yo;->uef(FFZLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 121
    .line 122
    .line 123
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    if-eqz v2, :cond_9

    .line 125
    .line 126
    :try_start_1
    iget-object v6, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 127
    .line 128
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    .line 129
    .line 130
    .line 131
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    const-string v7, "icon"

    .line 133
    .line 134
    if-eqz v6, :cond_4

    .line 135
    .line 136
    :try_start_2
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-virtual {v2, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    :cond_4
    iget-object v6, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 144
    .line 145
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kik()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-virtual {v2, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 150
    .line 151
    .line 152
    if-eqz p2, :cond_9

    .line 153
    .line 154
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    if-nez p2, :cond_5

    .line 159
    .line 160
    new-instance p2, Lorg/json/JSONObject;

    .line 161
    .line 162
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 163
    .line 164
    .line 165
    :cond_5
    iget-object v6, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 166
    .line 167
    if-eqz v6, :cond_6

    .line 168
    .line 169
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->sk()Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    if-eqz v6, :cond_6

    .line 174
    .line 175
    const-string v8, "showAdCount"

    .line 176
    .line 177
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->zjm()I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    invoke-virtual {p2, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 182
    .line 183
    .line 184
    :cond_6
    invoke-virtual {v2, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    new-instance p2, Lorg/json/JSONObject;

    .line 188
    .line 189
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 190
    .line 191
    .line 192
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 193
    .line 194
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->at()Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    if-ge v5, v6, :cond_8

    .line 203
    .line 204
    new-instance v6, Lorg/json/JSONObject;

    .line 205
    .line 206
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    check-cast v8, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 214
    .line 215
    const-string v9, "app_name"

    .line 216
    .line 217
    invoke-virtual {v8}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->wf()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    invoke-virtual {v6, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 222
    .line 223
    .line 224
    const-string v9, "title"

    .line 225
    .line 226
    invoke-virtual {v8}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->xw()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    invoke-virtual {v6, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v8}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kik()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-virtual {v6, v1, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    if-eqz v8, :cond_7

    .line 245
    .line 246
    invoke-virtual {v8}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 251
    .line 252
    .line 253
    :cond_7
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    invoke-virtual {p2, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 258
    .line 259
    .line 260
    add-int/lit8 v5, v5, 0x1

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_8
    const-string v0, "sub_ads"

    .line 264
    .line 265
    invoke-virtual {v2, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 266
    .line 267
    .line 268
    :catch_0
    :cond_9
    :try_start_3
    new-instance p2, Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 269
    .line 270
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    .line 271
    .line 272
    invoke-direct {p2, v0}, Lcom/bytedance/adsdk/ugeno/core/wrv;-><init>(Landroid/content/Context;)V

    .line 273
    .line 274
    .line 275
    new-instance v0, Lcom/bytedance/adsdk/ugeno/core/dj;

    .line 276
    .line 277
    invoke-direct {v0}, Lcom/bytedance/adsdk/ugeno/core/dj;-><init>()V

    .line 278
    .line 279
    .line 280
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    .line 281
    .line 282
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/core/dj;->uef(Landroid/content/Context;)V

    .line 283
    .line 284
    .line 285
    const-string p1, "endcardBackup"

    .line 286
    .line 287
    invoke-virtual {p2, p1, v0}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/core/dj;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2, p0}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lcom/bytedance/adsdk/ugeno/core/wk;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p2, p0}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lcom/bytedance/adsdk/ugeno/core/ab;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p2, v3, v2, v4}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 305
    .line 306
    const/4 v0, -0x1

    .line 307
    invoke-direct {p2, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 311
    .line 312
    .line 313
    :catchall_0
    return-void
.end method

.method public static uef()Z
    .locals 3

    .line 2
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->yo:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    .line 3
    const-string v0, "express_backup_type"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->yo:Ljava/lang/Boolean;

    .line 4
    :cond_1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->yo:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public uef(Lcom/bytedance/adsdk/ugeno/core/cq;Lcom/bytedance/adsdk/ugeno/core/wk$oa;Lcom/bytedance/adsdk/ugeno/core/wk$uef;)V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Landroid/view/MotionEvent;)V
    .locals 11

    .line 21
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    .line 22
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    .line 23
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_8

    if-eq v1, v3, :cond_5

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    goto/16 :goto_1

    .line 24
    :cond_0
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->cq:F

    iget v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->dj:F

    sub-float v5, p1, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    add-float/2addr v5, v1

    iput v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->cq:F

    .line 25
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->dz:F

    iget v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->wrv:F

    sub-float v5, v0, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    add-float/2addr v5, v1

    iput v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->dz:F

    .line 26
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->dj:F

    .line 27
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->wrv:F

    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->lw:J

    sub-long/2addr v0, v5

    const-wide/16 v5, 0xc8

    cmp-long p1, v0, v5

    if-lez p1, :cond_1

    .line 29
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->cq:F

    sget v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->oa:I

    int-to-float v1, v0

    cmpl-float p1, p1, v1

    if-gtz p1, :cond_2

    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->dz:F

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    move v3, v4

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->ivm:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sget v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->oa:I

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-gez p1, :cond_3

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->xs:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sget v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->oa:I

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_4

    .line 31
    :cond_3
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->zjm:Z

    :cond_4
    move v4, v3

    goto :goto_3

    .line 32
    :cond_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->bcc:F

    .line 33
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->cz:F

    .line 34
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->bcc:F

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->ivm:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sget v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->oa:I

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-gez p1, :cond_6

    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->cz:F

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->xs:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sget v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->oa:I

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_7

    .line 35
    :cond_6
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->zjm:Z

    :cond_7
    :goto_1
    const/4 v2, -0x1

    :goto_2
    move v4, v2

    goto :goto_3

    .line 36
    :cond_8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->ivm:F

    .line 37
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->xs:F

    .line 38
    iput-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->zjm:Z

    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->lw:J

    .line 40
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/wrv/yo;->uef(Landroid/view/MotionEvent;)V

    .line 41
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->ivm:F

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->dj:F

    .line 42
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->xs:F

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->wrv:F

    goto :goto_2

    .line 43
    :goto_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->uef:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSize()F

    move-result v1

    float-to-double v5, v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPressure()F

    move-result p2

    float-to-double v7, p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-direct/range {v3 .. v10}, Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;-><init>(IDDJ)V

    invoke-virtual {p1, v0, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;)V
    .locals 9

    if-nez p3, :cond_0

    goto/16 :goto_0

    .line 5
    :cond_0
    invoke-virtual {p3}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->oa()Ljava/lang/String;

    move-result-object p2

    .line 6
    const-string v0, "convert"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {p3}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->yo()Ljava/util/Map;

    move-result-object p2

    const/4 p3, -0x1

    if-eqz p2, :cond_1

    .line 8
    :try_start_0
    const-string v0, "adIndex"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 9
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 10
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    :catchall_0
    :cond_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 13
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->at()Ljava/util/List;

    move-result-object v0

    if-ltz p3, :cond_2

    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p3, v1, :cond_2

    .line 15
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    :cond_2
    if-eqz p2, :cond_4

    .line 16
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, p3, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gr:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;

    invoke-virtual {v0, p3, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/yo/lw;

    move-result-object v1

    .line 17
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p3, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lw:Ljava/lang/String;

    invoke-static {p3, p2}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/moa;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    .line 18
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    move-result-object v2

    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->dj:F

    iget v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->wrv:F

    iget v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->bcc:F

    iget v6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->cz:F

    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->uef:Landroid/util/SparseArray;

    iget-boolean v8, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->zjm:Z

    invoke-virtual/range {v1 .. v8}, Lcom/bytedance/sdk/openadsdk/core/yo/lw;->uef(Landroid/view/View;FFFFLandroid/util/SparseArray;Z)V

    goto :goto_0

    .line 19
    :cond_3
    const-string p1, "openPrivacy"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/yo;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p3, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lw:Ljava/lang/String;

    invoke-static {p1, p3, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method
