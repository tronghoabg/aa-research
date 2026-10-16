.class public Lorg/apache/tika/utils/CharsetUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CHARSET_NAME_PATTERN:Ljava/util/regex/Pattern;

.field private static final COMMON_CHARSETS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/nio/charset/Charset;",
            ">;"
        }
    .end annotation
.end field

.field private static final CP_NAME_PATTERN:Ljava/util/regex/Pattern;

.field private static final ISO_NAME_PATTERN:Ljava/util/regex/Pattern;

.field private static final WIN_NAME_PATTERN:Ljava/util/regex/Pattern;

.field private static getCharsetICU:Ljava/lang/reflect/Method;

.field private static isSupportedICU:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 37

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-class v2, Ljava/lang/String;

    .line 4
    .line 5
    const-string v3, "[ \\\"]*([^ >,;\\\"]+).*"

    .line 6
    .line 7
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sput-object v3, Lorg/apache/tika/utils/CharsetUtils;->CHARSET_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    const-string v3, ".*8859-(\\d+)"

    .line 14
    .line 15
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sput-object v3, Lorg/apache/tika/utils/CharsetUtils;->ISO_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    const-string v3, "cp-(\\d+)"

    .line 22
    .line 23
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sput-object v3, Lorg/apache/tika/utils/CharsetUtils;->CP_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 28
    .line 29
    const-string v3, "win-?(\\d+)"

    .line 30
    .line 31
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sput-object v3, Lorg/apache/tika/utils/CharsetUtils;->WIN_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 36
    .line 37
    new-instance v3, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v3, Lorg/apache/tika/utils/CharsetUtils;->COMMON_CHARSETS:Ljava/util/Map;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    sput-object v4, Lorg/apache/tika/utils/CharsetUtils;->getCharsetICU:Ljava/lang/reflect/Method;

    .line 46
    .line 47
    sput-object v4, Lorg/apache/tika/utils/CharsetUtils;->isSupportedICU:Ljava/lang/reflect/Method;

    .line 48
    .line 49
    const-string v35, "windows-1253"

    .line 50
    .line 51
    const-string v36, "windows-1255"

    .line 52
    .line 53
    const-string v5, "Big5"

    .line 54
    .line 55
    const-string v6, "EUC-JP"

    .line 56
    .line 57
    const-string v7, "EUC-KR"

    .line 58
    .line 59
    const-string v8, "x-EUC-TW"

    .line 60
    .line 61
    const-string v9, "GB18030"

    .line 62
    .line 63
    const-string v10, "IBM855"

    .line 64
    .line 65
    const-string v11, "IBM866"

    .line 66
    .line 67
    const-string v12, "ISO-2022-CN"

    .line 68
    .line 69
    const-string v13, "ISO-2022-JP"

    .line 70
    .line 71
    const-string v14, "ISO-2022-KR"

    .line 72
    .line 73
    const-string v15, "ISO-8859-1"

    .line 74
    .line 75
    const-string v16, "ISO-8859-2"

    .line 76
    .line 77
    const-string v17, "ISO-8859-3"

    .line 78
    .line 79
    const-string v18, "ISO-8859-4"

    .line 80
    .line 81
    const-string v19, "ISO-8859-5"

    .line 82
    .line 83
    const-string v20, "ISO-8859-6"

    .line 84
    .line 85
    const-string v21, "ISO-8859-7"

    .line 86
    .line 87
    const-string v22, "ISO-8859-8"

    .line 88
    .line 89
    const-string v23, "ISO-8859-9"

    .line 90
    .line 91
    const-string v24, "ISO-8859-11"

    .line 92
    .line 93
    const-string v25, "ISO-8859-13"

    .line 94
    .line 95
    const-string v26, "ISO-8859-15"

    .line 96
    .line 97
    const-string v27, "KOI8-R"

    .line 98
    .line 99
    const-string v28, "x-MacCyrillic"

    .line 100
    .line 101
    const-string v29, "SHIFT_JIS"

    .line 102
    .line 103
    const-string v30, "UTF-8"

    .line 104
    .line 105
    const-string v31, "UTF-16BE"

    .line 106
    .line 107
    const-string v32, "UTF-16LE"

    .line 108
    .line 109
    const-string v33, "windows-1251"

    .line 110
    .line 111
    const-string v34, "windows-1252"

    .line 112
    .line 113
    filled-new-array/range {v5 .. v36}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-static {v5}, Lorg/apache/tika/utils/CharsetUtils;->initCommonCharsets([Ljava/lang/String;)Ljava/util/Map;

    .line 118
    .line 119
    .line 120
    const-string v5, "iso-8859-1"

    .line 121
    .line 122
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Ljava/nio/charset/Charset;

    .line 127
    .line 128
    const-string v6, "iso-8851-1"

    .line 129
    .line 130
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    const-string v5, "windows-1252"

    .line 134
    .line 135
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, Ljava/nio/charset/Charset;

    .line 140
    .line 141
    const-string v6, "windows"

    .line 142
    .line 143
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    const-string v5, "koi8-r"

    .line 147
    .line 148
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, Ljava/nio/charset/Charset;

    .line 153
    .line 154
    const-string v6, "koi8r"

    .line 155
    .line 156
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    :try_start_0
    const-class v3, Lorg/apache/tika/utils/CharsetUtils;

    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    const-string v5, "com.ibm.icu.charset.CharsetICU"

    .line 166
    .line 167
    invoke-virtual {v3, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    :catch_0
    if-eqz v4, :cond_0

    .line 172
    .line 173
    :try_start_1
    const-string v3, "forNameICU"

    .line 174
    .line 175
    new-array v5, v1, [Ljava/lang/Class;

    .line 176
    .line 177
    aput-object v2, v5, v0

    .line 178
    .line 179
    invoke-virtual {v4, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    sput-object v3, Lorg/apache/tika/utils/CharsetUtils;->getCharsetICU:Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 184
    .line 185
    :try_start_2
    const-string v3, "isSupported"

    .line 186
    .line 187
    new-array v1, v1, [Ljava/lang/Class;

    .line 188
    .line 189
    aput-object v2, v1, v0

    .line 190
    .line 191
    invoke-virtual {v4, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    sput-object v0, Lorg/apache/tika/utils/CharsetUtils;->isSupportedICU:Ljava/lang/reflect/Method;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :catchall_0
    move-exception v0

    .line 199
    new-instance v1, Ljava/lang/RuntimeException;

    .line 200
    .line 201
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    throw v1

    .line 205
    :catchall_1
    :cond_0
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static clean(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Lorg/apache/tika/utils/CharsetUtils;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public static forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_8

    .line 3
    .line 4
    sget-object v1, Lorg/apache/tika/utils/CharsetUtils;->CHARSET_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_7

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v2, Lorg/apache/tika/utils/CharsetUtils;->COMMON_CHARSETS:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/nio/charset/Charset;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    return-object v3

    .line 37
    :cond_0
    const-string v4, "none"

    .line 38
    .line 39
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_6

    .line 44
    .line 45
    const-string v4, "no"

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_6

    .line 52
    .line 53
    sget-object v4, Lorg/apache/tika/utils/CharsetUtils;->ISO_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 54
    .line 55
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget-object v5, Lorg/apache/tika/utils/CharsetUtils;->CP_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 60
    .line 61
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    sget-object v6, Lorg/apache/tika/utils/CharsetUtils;->WIN_NAME_PATTERN:Ljava/util/regex/Pattern;

    .line 66
    .line 67
    invoke-virtual {v6, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    invoke-virtual {v4, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string v1, "iso-8859-"

    .line 82
    .line 83
    invoke-static {v1, p0}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    move-object v3, v1

    .line 92
    check-cast v3, Ljava/nio/charset/Charset;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_2

    .line 100
    .line 101
    invoke-virtual {v5, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string v1, "cp"

    .line 106
    .line 107
    invoke-static {v1, p0}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    move-object v3, v1

    .line 116
    check-cast v3, Ljava/nio/charset/Charset;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_3

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    const-string v1, "windows-"

    .line 130
    .line 131
    invoke-static {v1, p0}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    move-object v3, v1

    .line 140
    check-cast v3, Ljava/nio/charset/Charset;

    .line 141
    .line 142
    :cond_3
    :goto_0
    if-eqz v3, :cond_4

    .line 143
    .line 144
    return-object v3

    .line 145
    :cond_4
    sget-object v1, Lorg/apache/tika/utils/CharsetUtils;->getCharsetICU:Ljava/lang/reflect/Method;

    .line 146
    .line 147
    if-eqz v1, :cond_5

    .line 148
    .line 149
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 150
    .line 151
    const/4 v2, 0x0

    .line 152
    aput-object p0, v0, v2

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    invoke-virtual {v1, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Ljava/nio/charset/Charset;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    .line 161
    if-eqz v0, :cond_5

    .line 162
    .line 163
    return-object v0

    .line 164
    :catch_0
    :cond_5
    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :cond_6
    new-instance v0, Ljava/nio/charset/IllegalCharsetNameException;

    .line 170
    .line 171
    invoke-direct {v0, p0}, Ljava/nio/charset/IllegalCharsetNameException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v0

    .line 175
    :cond_7
    new-instance v0, Ljava/nio/charset/IllegalCharsetNameException;

    .line 176
    .line 177
    invoke-direct {v0, p0}, Ljava/nio/charset/IllegalCharsetNameException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v0

    .line 181
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 182
    .line 183
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 184
    .line 185
    .line 186
    throw p0
.end method

.method private static varargs initCommonCharsets([Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/nio/charset/Charset;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v3, p0, v2

    .line 11
    .line 12
    :try_start_0
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    sget-object v5, Lorg/apache/tika/utils/CharsetUtils;->COMMON_CHARSETS:Ljava/util/Map;

    .line 17
    .line 18
    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-virtual {v3, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/nio/charset/Charset;->aliases()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Ljava/lang/String;

    .line 46
    .line 47
    sget-object v6, Lorg/apache/tika/utils/CharsetUtils;->COMMON_CHARSETS:Ljava/util/Map;

    .line 48
    .line 49
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-virtual {v5, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-interface {v6, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catch_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return-object v0
.end method

.method public static isSupported(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    sget-object v2, Lorg/apache/tika/utils/CharsetUtils;->isSupportedICU:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    new-array v3, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    aput-object p0, v3, v1

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    invoke-static {p0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p0
    :try_end_0
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return p0

    .line 30
    :catch_0
    return v1
.end method
