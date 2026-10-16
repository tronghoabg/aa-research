.class public final Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u0008*\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u0008*\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u001f\"\u0004\u0008\u0000\u0010\u001d2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001e\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
        "",
        "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
        "helper",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V",
        "Lokhttp3/ResponseBody;",
        "response",
        "",
        "convertResponseBody",
        "(Lokhttp3/ResponseBody;)Ljava/lang/String;",
        "Lorg/json/JSONObject;",
        "field",
        "getJsonObject",
        "(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;",
        "",
        "getInt",
        "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;",
        "getString",
        "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;",
        "fieldName",
        "toFormatString",
        "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;",
        "value",
        "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;",
        "getQonversionErrorCode",
        "(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/QonversionErrorCode;",
        "getAdditionalMessageForCode",
        "(Ljava/lang/Integer;)Ljava/lang/String;",
        "T",
        "Lzg/Q;",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "getErrorFromResponse",
        "(Lzg/Q;)Lcom/qonversion/android/sdk/dto/QonversionError;",
        "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final CODE:Ljava/lang/String; = "code"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DATA:Ljava/lang/String; = "data"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final ERROR:Ljava/lang/String; = "error"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MESSAGE:Ljava/lang/String; = "message"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final helper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->Companion:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/api/ApiHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "helper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->helper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    .line 10
    .line 11
    return-void
.end method

.method private final convertResponseBody(Lokhttp3/ResponseBody;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lcg/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-wide v0, 0x7fffffffffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0, v1}, Lcg/i;->request(J)Z

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lcg/i;->getBuffer()Lcg/g;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcg/g;->b()Lcg/g;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "UTF-8"

    .line 22
    .line 23
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "forName(...)"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-wide v1, p1, Lcg/g;->b:J

    .line 33
    .line 34
    invoke-virtual {p1, v1, v2, v0}, Lcg/g;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method private final getAdditionalMessageForCode(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x4ee9

    .line 9
    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const-string p1, "For more details please check our guide [Troubleshooting](https://documentation.qonversion.io/docs/troubleshooting)"

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    :goto_0
    if-nez p1, :cond_2

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/16 v0, 0x4eeb

    .line 23
    .line 24
    if-ne p1, v0, :cond_3

    .line 25
    .line 26
    const-string p1, "Possible reasons for this error are fraud purchases and incorrect configuration of the project key in the Qonversion Dashboard"

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 30
    return-object p1
.end method

.method private final getInt(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method private final getJsonObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private final getQonversionErrorCode(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/QonversionErrorCode;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x2712

    .line 9
    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    if-nez p1, :cond_2

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v1, 0x2713

    .line 21
    .line 22
    if-ne v0, v1, :cond_3

    .line 23
    .line 24
    :goto_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_3
    :goto_2
    if-nez p1, :cond_4

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/16 v1, 0x2714

    .line 35
    .line 36
    if-ne v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_5

    .line 39
    :cond_5
    :goto_3
    if-nez p1, :cond_6

    .line 40
    .line 41
    goto :goto_4

    .line 42
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/16 v1, 0x2715

    .line 47
    .line 48
    if-ne v0, v1, :cond_7

    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_7
    :goto_4
    if-nez p1, :cond_8

    .line 52
    .line 53
    goto :goto_6

    .line 54
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/16 v1, 0x4e2e

    .line 59
    .line 60
    if-ne v0, v1, :cond_9

    .line 61
    .line 62
    :goto_5
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidClientUid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_9
    :goto_6
    if-nez p1, :cond_a

    .line 66
    .line 67
    goto :goto_7

    .line 68
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/16 v1, 0x2716

    .line 73
    .line 74
    if-ne v0, v1, :cond_b

    .line 75
    .line 76
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->UnknownClientPlatform:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_b
    :goto_7
    if-nez p1, :cond_c

    .line 80
    .line 81
    goto :goto_8

    .line 82
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const/16 v1, 0x2718

    .line 87
    .line 88
    if-ne v0, v1, :cond_d

    .line 89
    .line 90
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FraudPurchase:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_d
    :goto_8
    if-nez p1, :cond_e

    .line 94
    .line 95
    goto :goto_9

    .line 96
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    const/16 v1, 0x4e25

    .line 101
    .line 102
    if-ne v0, v1, :cond_f

    .line 103
    .line 104
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FeatureNotSupported:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 105
    .line 106
    return-object p1

    .line 107
    :cond_f
    :goto_9
    if-nez p1, :cond_10

    .line 108
    .line 109
    goto :goto_a

    .line 110
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const/16 v1, 0x4e26

    .line 115
    .line 116
    if-ne v0, v1, :cond_11

    .line 117
    .line 118
    goto :goto_e

    .line 119
    :cond_11
    :goto_a
    if-nez p1, :cond_12

    .line 120
    .line 121
    goto :goto_b

    .line 122
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    const/16 v1, 0x4e27

    .line 127
    .line 128
    if-ne v0, v1, :cond_13

    .line 129
    .line 130
    goto :goto_e

    .line 131
    :cond_13
    :goto_b
    if-nez p1, :cond_14

    .line 132
    .line 133
    goto :goto_c

    .line 134
    :cond_14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    const/16 v1, 0x4f4c

    .line 139
    .line 140
    if-ne v0, v1, :cond_15

    .line 141
    .line 142
    goto :goto_e

    .line 143
    :cond_15
    :goto_c
    if-nez p1, :cond_16

    .line 144
    .line 145
    goto :goto_d

    .line 146
    :cond_16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    const/16 v1, 0x4f4f

    .line 151
    .line 152
    if-ne v0, v1, :cond_17

    .line 153
    .line 154
    goto :goto_e

    .line 155
    :cond_17
    :goto_d
    if-nez p1, :cond_18

    .line 156
    .line 157
    goto :goto_f

    .line 158
    :cond_18
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    const/16 v1, 0x4faf

    .line 163
    .line 164
    if-ne v0, v1, :cond_19

    .line 165
    .line 166
    :goto_e
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PlayStoreError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 167
    .line 168
    return-object p1

    .line 169
    :cond_19
    :goto_f
    if-nez p1, :cond_1a

    .line 170
    .line 171
    goto :goto_10

    .line 172
    :cond_1a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    const/16 v1, 0x4e28

    .line 177
    .line 178
    if-ne v0, v1, :cond_1b

    .line 179
    .line 180
    goto :goto_13

    .line 181
    :cond_1b
    :goto_10
    if-nez p1, :cond_1c

    .line 182
    .line 183
    goto :goto_11

    .line 184
    :cond_1c
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    const/16 v1, 0x4e2a

    .line 189
    .line 190
    if-ne v0, v1, :cond_1d

    .line 191
    .line 192
    goto :goto_13

    .line 193
    :cond_1d
    :goto_11
    if-nez p1, :cond_1e

    .line 194
    .line 195
    goto :goto_12

    .line 196
    :cond_1e
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    const/16 v1, 0x4eeb

    .line 201
    .line 202
    if-ne v0, v1, :cond_1f

    .line 203
    .line 204
    goto :goto_13

    .line 205
    :cond_1f
    :goto_12
    if-nez p1, :cond_20

    .line 206
    .line 207
    goto :goto_14

    .line 208
    :cond_20
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    const/16 v1, 0x4ef2

    .line 213
    .line 214
    if-ne v0, v1, :cond_21

    .line 215
    .line 216
    :goto_13
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 217
    .line 218
    return-object p1

    .line 219
    :cond_21
    :goto_14
    if-nez p1, :cond_22

    .line 220
    .line 221
    goto :goto_15

    .line 222
    :cond_22
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    const/16 v1, 0x4e2b

    .line 227
    .line 228
    if-ne v0, v1, :cond_23

    .line 229
    .line 230
    goto :goto_17

    .line 231
    :cond_23
    :goto_15
    if-nez p1, :cond_24

    .line 232
    .line 233
    goto :goto_16

    .line 234
    :cond_24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    const/16 v1, 0x4e2c

    .line 239
    .line 240
    if-ne v0, v1, :cond_25

    .line 241
    .line 242
    goto :goto_17

    .line 243
    :cond_25
    :goto_16
    if-nez p1, :cond_26

    .line 244
    .line 245
    goto :goto_18

    .line 246
    :cond_26
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    const/16 v1, 0x4e2d

    .line 251
    .line 252
    if-ne v0, v1, :cond_27

    .line 253
    .line 254
    :goto_17
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProjectConfigError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 255
    .line 256
    return-object p1

    .line 257
    :cond_27
    :goto_18
    if-nez p1, :cond_28

    .line 258
    .line 259
    goto :goto_19

    .line 260
    :cond_28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    const/16 v0, 0x4ee9

    .line 265
    .line 266
    if-ne p1, v0, :cond_29

    .line 267
    .line 268
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidStoreCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 269
    .line 270
    return-object p1

    .line 271
    :cond_29
    :goto_19
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BackendError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 272
    .line 273
    return-object p1
.end method

.method private final getString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 16
    return-object p1
.end method

.method private final toFormatString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p2, "="

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method


# virtual methods
.method public final getErrorFromResponse(Lzg/Q;)Lcom/qonversion/android/sdk/dto/QonversionError;
    .locals 7
    .param p1    # Lzg/Q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzg/Q<",
            "TT;>;)",
            "Lcom/qonversion/android/sdk/dto/QonversionError;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    const-string v1, "data"

    .line 4
    .line 5
    const-string v2, "value"

    .line 6
    .line 7
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/String;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v3, p1, Lzg/Q;->a:Lokhttp3/Response;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    iget-object p1, p1, Lzg/Q;->c:Lokhttp3/ResponseBody;

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    :try_start_0
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->convertResponseBody(Lokhttp3/ResponseBody;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v5, Lorg/json/JSONObject;

    .line 27
    .line 28
    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v3, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 32
    .line 33
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->helper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, p1}, Lcom/qonversion/android/sdk/internal/api/ApiHelper;->isDeprecatedEndpoint(Lokhttp3/Request;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-direct {p0, v5, v1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getJsonObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {p0, p1, v1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->toFormatString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    move-object v2, v0

    .line 55
    :cond_0
    const-string v0, "code"

    .line 56
    .line 57
    invoke-direct {p0, p1, v0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getInt(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    goto :goto_2

    .line 62
    :catch_0
    move-exception p1

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-direct {p0, v5, v0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getJsonObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v1, "message"

    .line 69
    .line 70
    invoke-direct {p0, p1, v1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1, v0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->toFormatString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    :goto_0
    move-object v2, p1

    .line 81
    goto :goto_2

    .line 82
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string v0, "error="

    .line 87
    .line 88
    invoke-static {v0, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    goto :goto_0

    .line 93
    :catch_1
    const-string p1, "error=failed to parse the backend response"

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    :goto_2
    invoke-direct {p0, v4}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getQonversionErrorCode(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {p0, v4}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getAdditionalMessageForCode(Ljava/lang/Integer;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v1, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 105
    .line 106
    iget v4, v3, Lokhttp3/Response;->d:I

    .line 107
    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    const-string v0, ""

    .line 111
    .line 112
    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v6, "HTTP status code="

    .line 115
    .line 116
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v4, ", "

    .line 123
    .line 124
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v2, ". "

    .line 131
    .line 132
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iget v2, v3, Lokhttp3/Response;->d:I

    .line 143
    .line 144
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-direct {v1, p1, v0, v2}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 149
    .line 150
    .line 151
    return-object v1
.end method
