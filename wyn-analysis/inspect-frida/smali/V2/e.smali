.class public final LV2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP2/l;


# static fields
.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:Ljava/util/regex/Pattern;

.field public static final f:Ljava/util/regex/Pattern;

.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;

.field public static final i:LV2/d;


# instance fields
.field public final a:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LV2/e;->b:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LV2/e;->c:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "^(([0-9]*.)?[0-9]+)(px|em|%)$"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LV2/e;->d:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "^([-+]?\\d+\\.?\\d*?)%$"

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, LV2/e;->e:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    const-string v0, "^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$"

    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, LV2/e;->f:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    const-string v0, "^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$"

    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, LV2/e;->g:Ljava/util/regex/Pattern;

    .line 48
    .line 49
    const-string v0, "^(\\d+) (\\d+)$"

    .line 50
    .line 51
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, LV2/e;->h:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    new-instance v0, LV2/d;

    .line 58
    .line 59
    const/high16 v1, 0x41f00000    # 30.0f

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    invoke-direct {v0, v1, v2, v2}, LV2/d;-><init>(FII)V

    .line 63
    .line 64
    .line 65
    sput-object v0, LV2/e;->i:LV2/d;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LV2/e;->a:Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->setNamespaceAware(Z)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception v0

    .line 16
    new-instance v1, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    const-string v2, "Couldn\'t create XmlPullParserFactory instance"

    .line 19
    .line 20
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw v1
.end method

.method public static a(LV2/g;)LV2/g;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance p0, LV2/g;

    .line 4
    .line 5
    invoke-direct {p0}, LV2/g;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-object p0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "tt"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "head"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "body"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "div"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, "p"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const-string v0, "span"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    const-string v0, "br"

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    const-string v0, "style"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    const-string v0, "styling"

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_1

    .line 72
    .line 73
    const-string v0, "layout"

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_1

    .line 80
    .line 81
    const-string v0, "region"

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    const-string v0, "metadata"

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_1

    .line 96
    .line 97
    const-string v0, "image"

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_1

    .line 104
    .line 105
    const-string v0, "data"

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_1

    .line 112
    .line 113
    const-string v0, "information"

    .line 114
    .line 115
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_0

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_0
    const/4 p0, 0x0

    .line 123
    return p0

    .line 124
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 125
    return p0
.end method

.method public static c(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 8

    .line 1
    const-string v0, "Invalid cell resolution "

    .line 2
    .line 3
    const-string v1, "http://www.w3.org/ns/ttml#parameter"

    .line 4
    .line 5
    const-string v2, "cellResolution"

    .line 6
    .line 7
    invoke-interface {p0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/16 v1, 0xf

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    sget-object v2, LV2/e;->h:Ljava/util/regex/Pattern;

    .line 17
    .line 18
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const-string v4, "Ignoring malformed cell resolution: "

    .line 27
    .line 28
    const-string v5, "TtmlParser"

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {v5, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return v1

    .line 40
    :cond_1
    const/4 v3, 0x1

    .line 41
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    const/4 v7, 0x2

    .line 53
    invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    const/4 v3, 0x0

    .line 70
    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, " "

    .line 79
    .line 80
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0, v3}, LQ1/k;->b(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    return v2

    .line 94
    :catch_0
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {v5, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return v1
.end method

.method public static d(Ljava/lang/String;LV2/g;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, -0x1

    .line 4
    sget v3, LQ1/x;->a:I

    .line 5
    .line 6
    const-string v3, "\\s+"

    .line 7
    .line 8
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    array-length v4, v3

    .line 13
    sget-object v5, LV2/e;->d:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    if-ne v4, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v5, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    array-length v4, v3

    .line 23
    if-ne v4, v1, :cond_5

    .line 24
    .line 25
    aget-object v3, v3, v0

    .line 26
    .line 27
    invoke-virtual {v5, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "TtmlParser"

    .line 32
    .line 33
    const-string v5, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."

    .line 34
    .line 35
    invoke-static {v4, v5}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const-string v5, "\'."

    .line 43
    .line 44
    if-eqz v4, :cond_4

    .line 45
    .line 46
    const/4 p0, 0x3

    .line 47
    invoke-virtual {v3, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    sparse-switch v6, :sswitch_data_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :sswitch_0
    const-string v6, "px"

    .line 63
    .line 64
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-nez v6, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move v2, v1

    .line 72
    goto :goto_1

    .line 73
    :sswitch_1
    const-string v6, "em"

    .line 74
    .line 75
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-nez v6, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v2, v0

    .line 83
    goto :goto_1

    .line 84
    :sswitch_2
    const-string v6, "%"

    .line 85
    .line 86
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    const/4 v2, 0x0

    .line 94
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 95
    .line 96
    .line 97
    new-instance p0, LP2/f;

    .line 98
    .line 99
    const-string p1, "Invalid unit for fontSize: \'"

    .line 100
    .line 101
    invoke-static {p1, v4, v5}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :pswitch_0
    iput v0, p1, LV2/g;->j:I

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :pswitch_1
    iput v1, p1, LV2/g;->j:I

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :pswitch_2
    iput p0, p1, LV2/g;->j:I

    .line 116
    .line 117
    :goto_2
    invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    iput p0, p1, LV2/g;->k:F

    .line 129
    .line 130
    return-void

    .line 131
    :cond_4
    new-instance p1, LP2/f;

    .line 132
    .line 133
    const-string v0, "Invalid expression for fontSize: \'"

    .line 134
    .line 135
    invoke-static {v0, p0, v5}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_5
    new-instance p0, LP2/f;

    .line 144
    .line 145
    new-instance p1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v0, "Invalid number of entries for fontSize: "

    .line 148
    .line 149
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    array-length v0, v3

    .line 153
    const-string v1, "."

    .line 154
    .line 155
    invoke-static {v0, v1, p1}, LA7/p0;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p0

    .line 163
    :sswitch_data_0
    .sparse-switch
        0x25 -> :sswitch_2
        0xca8 -> :sswitch_1
        0xe08 -> :sswitch_0
    .end sparse-switch

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Lorg/xmlpull/v1/XmlPullParser;)LV2/d;
    .locals 7

    .line 1
    const-string v0, "http://www.w3.org/ns/ttml#parameter"

    .line 2
    .line 3
    const-string v1, "frameRate"

    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 v1, 0x1e

    .line 17
    .line 18
    :goto_0
    const-string v2, "frameRateMultiplier"

    .line 19
    .line 20
    invoke-interface {p0, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    sget v3, LQ1/x;->a:I

    .line 27
    .line 28
    const/4 v3, -0x1

    .line 29
    const-string v4, " "

    .line 30
    .line 31
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    array-length v3, v2

    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x1

    .line 39
    if-ne v3, v4, :cond_1

    .line 40
    .line 41
    move v3, v6

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v3, v5

    .line 44
    :goto_1
    const-string v4, "frameRateMultiplier doesn\'t have 2 parts"

    .line 45
    .line 46
    invoke-static {v4, v3}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    aget-object v3, v2, v5

    .line 50
    .line 51
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    int-to-float v3, v3

    .line 56
    aget-object v2, v2, v6

    .line 57
    .line 58
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    int-to-float v2, v2

    .line 63
    div-float/2addr v3, v2

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const/high16 v3, 0x3f800000    # 1.0f

    .line 66
    .line 67
    :goto_2
    sget-object v2, LV2/e;->i:LV2/d;

    .line 68
    .line 69
    iget v4, v2, LV2/d;->b:I

    .line 70
    .line 71
    const-string v5, "subFrameRate"

    .line 72
    .line 73
    invoke-interface {p0, v0, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    :cond_3
    const-string v5, "tickRate"

    .line 84
    .line 85
    invoke-interface {p0, v0, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_4

    .line 90
    .line 91
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    iget p0, v2, LV2/d;->c:I

    .line 97
    .line 98
    :goto_3
    new-instance v0, LV2/d;

    .line 99
    .line 100
    int-to-float v1, v1

    .line 101
    mul-float/2addr v1, v3

    .line 102
    invoke-direct {v0, v1, v4, p0}, LV2/d;-><init>(FII)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method

.method public static f(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/HashMap;ILD9/n;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, -0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 12
    .line 13
    .line 14
    const-string v7, "style"

    .line 15
    .line 16
    invoke-static {v0, v7}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v8

    .line 20
    if-eqz v8, :cond_4

    .line 21
    .line 22
    invoke-static {v0, v7}, LQ1/k;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    new-instance v8, LV2/g;

    .line 27
    .line 28
    invoke-direct {v8}, LV2/g;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v8}, LV2/e;->h(Lorg/xmlpull/v1/XmlPullParser;LV2/g;)LV2/g;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    if-eqz v7, :cond_1

    .line 36
    .line 37
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    if-eqz v9, :cond_0

    .line 46
    .line 47
    new-array v7, v5, [Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    sget v9, LQ1/x;->a:I

    .line 51
    .line 52
    const-string v9, "\\s+"

    .line 53
    .line 54
    invoke-virtual {v7, v9, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    :goto_1
    array-length v9, v7

    .line 59
    move v10, v5

    .line 60
    :goto_2
    if-ge v10, v9, :cond_1

    .line 61
    .line 62
    aget-object v11, v7, v10

    .line 63
    .line 64
    invoke-virtual {v1, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    check-cast v11, LV2/g;

    .line 69
    .line 70
    invoke-virtual {v8, v11}, LV2/g;->a(LV2/g;)V

    .line 71
    .line 72
    .line 73
    add-int/2addr v10, v6

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    iget-object v7, v8, LV2/g;->l:Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_2
    move-object/from16 v5, p4

    .line 83
    .line 84
    :cond_3
    :goto_3
    move-object/from16 v10, p5

    .line 85
    .line 86
    goto/16 :goto_f

    .line 87
    .line 88
    :cond_4
    const-string v7, "region"

    .line 89
    .line 90
    invoke-static {v0, v7}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    const-string v8, "id"

    .line 95
    .line 96
    if-eqz v7, :cond_15

    .line 97
    .line 98
    invoke-static {v0, v8}, LQ1/k;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    const/4 v7, 0x0

    .line 103
    if-nez v10, :cond_5

    .line 104
    .line 105
    goto/16 :goto_d

    .line 106
    .line 107
    :cond_5
    const-string v8, "origin"

    .line 108
    .line 109
    invoke-static {v0, v8}, LQ1/k;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    const-string v9, "TtmlParser"

    .line 114
    .line 115
    if-eqz v8, :cond_14

    .line 116
    .line 117
    sget-object v11, LV2/e;->f:Ljava/util/regex/Pattern;

    .line 118
    .line 119
    invoke-virtual {v11, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    sget-object v13, LV2/e;->g:Ljava/util/regex/Pattern;

    .line 124
    .line 125
    invoke-virtual {v13, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 130
    .line 131
    .line 132
    move-result v15

    .line 133
    const-string v4, "Ignoring region with missing tts:extent: "

    .line 134
    .line 135
    const-string v5, "Ignoring region with malformed origin: "

    .line 136
    .line 137
    const/high16 v16, 0x42c80000    # 100.0f

    .line 138
    .line 139
    if-eqz v15, :cond_6

    .line 140
    .line 141
    :try_start_0
    invoke-virtual {v12, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {v14}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    div-float v14, v14, v16

    .line 153
    .line 154
    invoke-virtual {v12, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v12}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 162
    .line 163
    .line 164
    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    div-float v5, v5, v16

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :catch_0
    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-static {v9, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_d

    .line 176
    .line 177
    :cond_6
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    .line 178
    .line 179
    .line 180
    move-result v12

    .line 181
    if-eqz v12, :cond_13

    .line 182
    .line 183
    if-nez v2, :cond_7

    .line 184
    .line 185
    invoke-virtual {v4, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-static {v9, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_d

    .line 193
    .line 194
    :cond_7
    :try_start_1
    invoke-virtual {v14, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v12

    .line 198
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    invoke-virtual {v14, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    int-to-float v12, v12

    .line 217
    iget v15, v2, LD9/n;->b:I

    .line 218
    .line 219
    int-to-float v15, v15

    .line 220
    div-float/2addr v12, v15

    .line 221
    int-to-float v14, v14

    .line 222
    iget v5, v2, LD9/n;->c:I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_3

    .line 223
    .line 224
    int-to-float v5, v5

    .line 225
    div-float v5, v14, v5

    .line 226
    .line 227
    move v14, v12

    .line 228
    :goto_4
    const-string v12, "extent"

    .line 229
    .line 230
    invoke-static {v0, v12}, LQ1/k;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    if-eqz v12, :cond_12

    .line 235
    .line 236
    invoke-virtual {v11, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    invoke-virtual {v13, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    .line 245
    .line 246
    .line 247
    move-result v13

    .line 248
    const-string v15, "Ignoring region with malformed extent: "

    .line 249
    .line 250
    if-eqz v13, :cond_8

    .line 251
    .line 252
    :try_start_2
    invoke-virtual {v11, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    div-float v4, v4, v16

    .line 264
    .line 265
    invoke-virtual {v11, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-static {v11}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 273
    .line 274
    .line 275
    move-result v7
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 276
    div-float v7, v7, v16

    .line 277
    .line 278
    :goto_5
    move v15, v4

    .line 279
    move/from16 v16, v7

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :catch_1
    invoke-virtual {v15, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    invoke-static {v9, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    goto/16 :goto_d

    .line 290
    .line 291
    :cond_8
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    if-eqz v11, :cond_11

    .line 296
    .line 297
    if-nez v2, :cond_9

    .line 298
    .line 299
    invoke-virtual {v4, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-static {v9, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_d

    .line 307
    .line 308
    :cond_9
    :try_start_3
    invoke-virtual {v12, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    invoke-virtual {v12, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    int-to-float v4, v4

    .line 331
    iget v12, v2, LD9/n;->b:I

    .line 332
    .line 333
    int-to-float v12, v12

    .line 334
    div-float/2addr v4, v12

    .line 335
    int-to-float v11, v11

    .line 336
    iget v7, v2, LD9/n;->c:I
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 337
    .line 338
    int-to-float v7, v7

    .line 339
    div-float v7, v11, v7

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :goto_6
    const-string v4, "displayAlign"

    .line 343
    .line 344
    invoke-static {v0, v4}, LQ1/k;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    if-eqz v4, :cond_c

    .line 349
    .line 350
    invoke-static {v4}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    const-string v7, "center"

    .line 358
    .line 359
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v7

    .line 363
    if-nez v7, :cond_b

    .line 364
    .line 365
    const-string v7, "after"

    .line 366
    .line 367
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    if-nez v4, :cond_a

    .line 372
    .line 373
    goto :goto_7

    .line 374
    :cond_a
    add-float v5, v5, v16

    .line 375
    .line 376
    move v12, v5

    .line 377
    move v11, v14

    .line 378
    move v14, v3

    .line 379
    goto :goto_8

    .line 380
    :cond_b
    const/high16 v4, 0x40000000    # 2.0f

    .line 381
    .line 382
    div-float v4, v16, v4

    .line 383
    .line 384
    add-float/2addr v5, v4

    .line 385
    move v12, v5

    .line 386
    move v11, v14

    .line 387
    move v14, v6

    .line 388
    goto :goto_8

    .line 389
    :cond_c
    :goto_7
    move v12, v5

    .line 390
    move v11, v14

    .line 391
    const/4 v14, 0x0

    .line 392
    :goto_8
    const/high16 v4, 0x3f800000    # 1.0f

    .line 393
    .line 394
    move/from16 v5, p2

    .line 395
    .line 396
    int-to-float v7, v5

    .line 397
    div-float v18, v4, v7

    .line 398
    .line 399
    const-string v4, "writingMode"

    .line 400
    .line 401
    invoke-static {v0, v4}, LQ1/k;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    if-eqz v4, :cond_10

    .line 406
    .line 407
    invoke-static {v4}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 415
    .line 416
    .line 417
    move-result v7

    .line 418
    sparse-switch v7, :sswitch_data_0

    .line 419
    .line 420
    .line 421
    :goto_9
    const/4 v4, -0x1

    .line 422
    goto :goto_a

    .line 423
    :sswitch_0
    const-string v7, "tbrl"

    .line 424
    .line 425
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    if-nez v4, :cond_d

    .line 430
    .line 431
    goto :goto_9

    .line 432
    :cond_d
    move v4, v3

    .line 433
    goto :goto_a

    .line 434
    :sswitch_1
    const-string v7, "tblr"

    .line 435
    .line 436
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    if-nez v4, :cond_e

    .line 441
    .line 442
    goto :goto_9

    .line 443
    :cond_e
    move v4, v6

    .line 444
    goto :goto_a

    .line 445
    :sswitch_2
    const-string v7, "tb"

    .line 446
    .line 447
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    if-nez v4, :cond_f

    .line 452
    .line 453
    goto :goto_9

    .line 454
    :cond_f
    const/4 v4, 0x0

    .line 455
    :goto_a
    packed-switch v4, :pswitch_data_0

    .line 456
    .line 457
    .line 458
    goto :goto_b

    .line 459
    :pswitch_0
    move/from16 v19, v6

    .line 460
    .line 461
    goto :goto_c

    .line 462
    :pswitch_1
    move/from16 v19, v3

    .line 463
    .line 464
    goto :goto_c

    .line 465
    :cond_10
    :goto_b
    const/high16 v4, -0x80000000

    .line 466
    .line 467
    move/from16 v19, v4

    .line 468
    .line 469
    :goto_c
    new-instance v9, LV2/f;

    .line 470
    .line 471
    const/4 v13, 0x0

    .line 472
    const/16 v17, 0x1

    .line 473
    .line 474
    invoke-direct/range {v9 .. v19}, LV2/f;-><init>(Ljava/lang/String;FFIIFFIFI)V

    .line 475
    .line 476
    .line 477
    move-object v7, v9

    .line 478
    goto :goto_d

    .line 479
    :catch_2
    move/from16 v5, p2

    .line 480
    .line 481
    invoke-virtual {v15, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    invoke-static {v9, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    goto :goto_d

    .line 489
    :cond_11
    move/from16 v5, p2

    .line 490
    .line 491
    const-string v4, "Ignoring region with unsupported extent: "

    .line 492
    .line 493
    invoke-virtual {v4, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    invoke-static {v9, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_12
    move/from16 v5, p2

    .line 502
    .line 503
    const-string v4, "Ignoring region without an extent"

    .line 504
    .line 505
    invoke-static {v9, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    goto :goto_d

    .line 509
    :catch_3
    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    invoke-static {v9, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    goto :goto_d

    .line 517
    :cond_13
    const-string v4, "Ignoring region with unsupported origin: "

    .line 518
    .line 519
    invoke-virtual {v4, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    invoke-static {v9, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    goto :goto_d

    .line 527
    :cond_14
    const-string v4, "Ignoring region without an origin"

    .line 528
    .line 529
    invoke-static {v9, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    :goto_d
    if-eqz v7, :cond_2

    .line 533
    .line 534
    iget-object v4, v7, LV2/f;->a:Ljava/lang/String;

    .line 535
    .line 536
    move-object/from16 v5, p4

    .line 537
    .line 538
    invoke-virtual {v5, v4, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    goto/16 :goto_3

    .line 542
    .line 543
    :cond_15
    move-object/from16 v5, p4

    .line 544
    .line 545
    const-string v4, "metadata"

    .line 546
    .line 547
    invoke-static {v0, v4}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 548
    .line 549
    .line 550
    move-result v7

    .line 551
    if-eqz v7, :cond_3

    .line 552
    .line 553
    :cond_16
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 554
    .line 555
    .line 556
    const-string v7, "image"

    .line 557
    .line 558
    invoke-static {v0, v7}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 559
    .line 560
    .line 561
    move-result v7

    .line 562
    if-eqz v7, :cond_17

    .line 563
    .line 564
    invoke-static {v0, v8}, LQ1/k;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v7

    .line 568
    if-eqz v7, :cond_17

    .line 569
    .line 570
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v9

    .line 574
    move-object/from16 v10, p5

    .line 575
    .line 576
    invoke-virtual {v10, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    goto :goto_e

    .line 580
    :cond_17
    move-object/from16 v10, p5

    .line 581
    .line 582
    :goto_e
    invoke-static {v0, v4}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 583
    .line 584
    .line 585
    move-result v7

    .line 586
    if-eqz v7, :cond_16

    .line 587
    .line 588
    :goto_f
    const-string v4, "head"

    .line 589
    .line 590
    invoke-static {v0, v4}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    if-eqz v4, :cond_18

    .line 595
    .line 596
    return-void

    .line 597
    :cond_18
    const/4 v4, -0x1

    .line 598
    const/4 v5, 0x0

    .line 599
    goto/16 :goto_0

    .line 600
    .line 601
    :sswitch_data_0
    .sparse-switch
        0xe6e -> :sswitch_2
        0x363874 -> :sswitch_1
        0x363928 -> :sswitch_0
    .end sparse-switch

    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Lorg/xmlpull/v1/XmlPullParser;LV2/c;Ljava/util/HashMap;LV2/d;)LV2/c;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    move-object/from16 v1, p3

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-static {v0, v5}, LV2/e;->h(Lorg/xmlpull/v1/XmlPullParser;LV2/g;)LV2/g;

    .line 14
    .line 15
    .line 16
    move-result-object v7

    .line 17
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const-string v6, ""

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    move-wide v12, v8

    .line 26
    move-wide v14, v12

    .line 27
    move-wide/from16 v16, v14

    .line 28
    .line 29
    move-wide/from16 v18, v16

    .line 30
    .line 31
    move-object v8, v5

    .line 32
    move-object v9, v6

    .line 33
    move v6, v10

    .line 34
    :goto_0
    if-ge v6, v4, :cond_a

    .line 35
    .line 36
    move-wide/from16 v20, v12

    .line 37
    .line 38
    invoke-interface {v0, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v12

    .line 42
    invoke-interface {v0, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v13

    .line 46
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v22

    .line 53
    sparse-switch v22, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    :goto_1
    const/4 v2, -0x1

    .line 57
    goto :goto_2

    .line 58
    :sswitch_0
    const-string v2, "backgroundImage"

    .line 59
    .line 60
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    const/4 v2, 0x5

    .line 68
    goto :goto_2

    .line 69
    :sswitch_1
    const-string v2, "style"

    .line 70
    .line 71
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    const/4 v2, 0x4

    .line 79
    goto :goto_2

    .line 80
    :sswitch_2
    const-string v2, "begin"

    .line 81
    .line 82
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    const/4 v2, 0x3

    .line 90
    goto :goto_2

    .line 91
    :sswitch_3
    const-string v2, "end"

    .line 92
    .line 93
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    const/4 v2, 0x2

    .line 101
    goto :goto_2

    .line 102
    :sswitch_4
    const-string v2, "dur"

    .line 103
    .line 104
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_4

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    move v2, v3

    .line 112
    goto :goto_2

    .line 113
    :sswitch_5
    const-string v2, "region"

    .line 114
    .line 115
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-nez v2, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    move v2, v10

    .line 123
    :goto_2
    packed-switch v2, :pswitch_data_0

    .line 124
    .line 125
    .line 126
    :cond_6
    move-object/from16 v2, p2

    .line 127
    .line 128
    const/16 v22, -0x1

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :pswitch_0
    const-string v2, "#"

    .line 132
    .line 133
    invoke-virtual {v13, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    invoke-virtual {v13, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    move-object v5, v2

    .line 144
    const/16 v22, -0x1

    .line 145
    .line 146
    :goto_3
    move-object/from16 v2, p2

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :pswitch_1
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    if-eqz v12, :cond_7

    .line 158
    .line 159
    new-array v2, v10, [Ljava/lang/String;

    .line 160
    .line 161
    const/4 v13, -0x1

    .line 162
    goto :goto_4

    .line 163
    :cond_7
    sget v12, LQ1/x;->a:I

    .line 164
    .line 165
    const-string v12, "\\s+"

    .line 166
    .line 167
    const/4 v13, -0x1

    .line 168
    invoke-virtual {v2, v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    :goto_4
    array-length v12, v2

    .line 173
    if-lez v12, :cond_8

    .line 174
    .line 175
    move-object v8, v2

    .line 176
    move/from16 v22, v13

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_8
    move-object/from16 v2, p2

    .line 180
    .line 181
    move/from16 v22, v13

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :pswitch_2
    const/16 v22, -0x1

    .line 185
    .line 186
    invoke-static {v13, v1}, LV2/e;->i(Ljava/lang/String;LV2/d;)J

    .line 187
    .line 188
    .line 189
    move-result-wide v14

    .line 190
    goto :goto_3

    .line 191
    :pswitch_3
    const/16 v22, -0x1

    .line 192
    .line 193
    invoke-static {v13, v1}, LV2/e;->i(Ljava/lang/String;LV2/d;)J

    .line 194
    .line 195
    .line 196
    move-result-wide v16

    .line 197
    goto :goto_3

    .line 198
    :pswitch_4
    const/16 v22, -0x1

    .line 199
    .line 200
    invoke-static {v13, v1}, LV2/e;->i(Ljava/lang/String;LV2/d;)J

    .line 201
    .line 202
    .line 203
    move-result-wide v18

    .line 204
    goto :goto_3

    .line 205
    :pswitch_5
    move-object/from16 v2, p2

    .line 206
    .line 207
    const/16 v22, -0x1

    .line 208
    .line 209
    invoke-virtual {v2, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    if-eqz v12, :cond_9

    .line 214
    .line 215
    move-object v9, v13

    .line 216
    :cond_9
    :goto_5
    add-int/2addr v6, v3

    .line 217
    move-wide/from16 v12, v20

    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_a
    move-wide/from16 v20, v12

    .line 222
    .line 223
    if-eqz v11, :cond_c

    .line 224
    .line 225
    iget-wide v1, v11, LV2/c;->d:J

    .line 226
    .line 227
    cmp-long v3, v1, v20

    .line 228
    .line 229
    if-eqz v3, :cond_c

    .line 230
    .line 231
    cmp-long v3, v14, v20

    .line 232
    .line 233
    if-eqz v3, :cond_b

    .line 234
    .line 235
    add-long/2addr v14, v1

    .line 236
    :cond_b
    cmp-long v3, v16, v20

    .line 237
    .line 238
    if-eqz v3, :cond_c

    .line 239
    .line 240
    add-long v16, v16, v1

    .line 241
    .line 242
    :cond_c
    move-wide v3, v14

    .line 243
    cmp-long v1, v16, v20

    .line 244
    .line 245
    if-nez v1, :cond_e

    .line 246
    .line 247
    cmp-long v1, v18, v20

    .line 248
    .line 249
    if-eqz v1, :cond_d

    .line 250
    .line 251
    add-long v16, v3, v18

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_d
    if-eqz v11, :cond_e

    .line 255
    .line 256
    iget-wide v1, v11, LV2/c;->e:J

    .line 257
    .line 258
    cmp-long v6, v1, v20

    .line 259
    .line 260
    if-eqz v6, :cond_e

    .line 261
    .line 262
    move-wide/from16 v16, v1

    .line 263
    .line 264
    :cond_e
    :goto_6
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    new-instance v0, LV2/c;

    .line 269
    .line 270
    const/4 v2, 0x0

    .line 271
    move-object v10, v5

    .line 272
    move-wide/from16 v5, v16

    .line 273
    .line 274
    invoke-direct/range {v0 .. v11}, LV2/c;-><init>(Ljava/lang/String;Ljava/lang/String;JJLV2/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LV2/c;)V

    .line 275
    .line 276
    .line 277
    return-object v0

    .line 278
    nop

    .line 279
    :sswitch_data_0
    .sparse-switch
        -0x37b7d90c -> :sswitch_5
        0x18601 -> :sswitch_4
        0x188db -> :sswitch_3
        0x59478a9 -> :sswitch_2
        0x68b1db1 -> :sswitch_1
        0x4d0b70cd -> :sswitch_0
    .end sparse-switch

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static h(Lorg/xmlpull/v1/XmlPullParser;LV2/g;)LV2/g;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "none"

    .line 4
    .line 5
    const-string v3, "after"

    .line 6
    .line 7
    const-string v4, "before"

    .line 8
    .line 9
    const-string v5, "start"

    .line 10
    .line 11
    const-string v6, "right"

    .line 12
    .line 13
    const-string v7, "left"

    .line 14
    .line 15
    const-string v8, "end"

    .line 16
    .line 17
    const-string v9, "center"

    .line 18
    .line 19
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    const/4 v14, 0x0

    .line 26
    :goto_0
    if-ge v14, v10, :cond_41

    .line 27
    .line 28
    invoke-interface {v1, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v12

    .line 32
    invoke-interface {v1, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v13

    .line 36
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const/16 v17, 0x0

    .line 40
    .line 41
    const-string v15, "TtmlParser"

    .line 42
    .line 43
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v19

    .line 47
    sparse-switch v19, :sswitch_data_0

    .line 48
    .line 49
    .line 50
    :goto_1
    const/4 v11, -0x1

    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :sswitch_0
    const-string v11, "multiRowAlign"

    .line 54
    .line 55
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    if-nez v11, :cond_0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    const/16 v11, 0xe

    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :sswitch_1
    const-string v11, "backgroundColor"

    .line 67
    .line 68
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    if-nez v11, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/16 v11, 0xd

    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :sswitch_2
    const-string v11, "rubyPosition"

    .line 80
    .line 81
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    if-nez v11, :cond_2

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const/16 v11, 0xc

    .line 89
    .line 90
    goto/16 :goto_2

    .line 91
    .line 92
    :sswitch_3
    const-string v11, "textEmphasis"

    .line 93
    .line 94
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-nez v11, :cond_3

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const/16 v11, 0xb

    .line 102
    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :sswitch_4
    const-string v11, "fontSize"

    .line 106
    .line 107
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    if-nez v11, :cond_4

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    const/16 v11, 0xa

    .line 115
    .line 116
    goto/16 :goto_2

    .line 117
    .line 118
    :sswitch_5
    const-string v11, "textCombine"

    .line 119
    .line 120
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    if-nez v11, :cond_5

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    const/16 v11, 0x9

    .line 128
    .line 129
    goto/16 :goto_2

    .line 130
    .line 131
    :sswitch_6
    const-string v11, "shear"

    .line 132
    .line 133
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    if-nez v11, :cond_6

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    const/16 v11, 0x8

    .line 141
    .line 142
    goto/16 :goto_2

    .line 143
    .line 144
    :sswitch_7
    const-string v11, "color"

    .line 145
    .line 146
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    if-nez v11, :cond_7

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_7
    const/4 v11, 0x7

    .line 154
    goto :goto_2

    .line 155
    :sswitch_8
    const-string v11, "ruby"

    .line 156
    .line 157
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    if-nez v11, :cond_8

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_8
    const/4 v11, 0x6

    .line 165
    goto :goto_2

    .line 166
    :sswitch_9
    const-string v11, "id"

    .line 167
    .line 168
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    if-nez v11, :cond_9

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_9
    const/4 v11, 0x5

    .line 176
    goto :goto_2

    .line 177
    :sswitch_a
    const-string v11, "fontWeight"

    .line 178
    .line 179
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    if-nez v11, :cond_a

    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :cond_a
    const/4 v11, 0x4

    .line 188
    goto :goto_2

    .line 189
    :sswitch_b
    const-string v11, "textDecoration"

    .line 190
    .line 191
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    if-nez v11, :cond_b

    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :cond_b
    const/4 v11, 0x3

    .line 200
    goto :goto_2

    .line 201
    :sswitch_c
    const-string v11, "textAlign"

    .line 202
    .line 203
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    if-nez v11, :cond_c

    .line 208
    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    :cond_c
    const/4 v11, 0x2

    .line 212
    goto :goto_2

    .line 213
    :sswitch_d
    const-string v11, "fontFamily"

    .line 214
    .line 215
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    if-nez v11, :cond_d

    .line 220
    .line 221
    goto/16 :goto_1

    .line 222
    .line 223
    :cond_d
    const/4 v11, 0x1

    .line 224
    goto :goto_2

    .line 225
    :sswitch_e
    const-string v11, "fontStyle"

    .line 226
    .line 227
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    if-nez v11, :cond_e

    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :cond_e
    const/4 v11, 0x0

    .line 236
    :goto_2
    packed-switch v11, :pswitch_data_0

    .line 237
    .line 238
    .line 239
    move-object/from16 v20, v3

    .line 240
    .line 241
    const/4 v1, 0x4

    .line 242
    const/4 v3, 0x2

    .line 243
    const/4 v11, 0x3

    .line 244
    const/16 v16, -0x1

    .line 245
    .line 246
    goto/16 :goto_18

    .line 247
    .line 248
    :pswitch_0
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v12}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 260
    .line 261
    .line 262
    move-result v12

    .line 263
    sparse-switch v12, :sswitch_data_1

    .line 264
    .line 265
    .line 266
    :goto_3
    const/4 v11, -0x1

    .line 267
    goto :goto_4

    .line 268
    :sswitch_f
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    if-nez v11, :cond_f

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_f
    const/4 v11, 0x4

    .line 276
    goto :goto_4

    .line 277
    :sswitch_10
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    if-nez v11, :cond_10

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_10
    const/4 v11, 0x3

    .line 285
    goto :goto_4

    .line 286
    :sswitch_11
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    if-nez v11, :cond_11

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_11
    const/4 v11, 0x2

    .line 294
    goto :goto_4

    .line 295
    :sswitch_12
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    if-nez v11, :cond_12

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_12
    const/4 v11, 0x1

    .line 303
    goto :goto_4

    .line 304
    :sswitch_13
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v11

    .line 308
    if-nez v11, :cond_13

    .line 309
    .line 310
    goto :goto_3

    .line 311
    :cond_13
    const/4 v11, 0x0

    .line 312
    :goto_4
    packed-switch v11, :pswitch_data_1

    .line 313
    .line 314
    .line 315
    :goto_5
    move-object/from16 v11, v17

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :pswitch_1
    sget-object v17, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 319
    .line 320
    goto :goto_5

    .line 321
    :pswitch_2
    sget-object v17, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 322
    .line 323
    goto :goto_5

    .line 324
    :pswitch_3
    sget-object v17, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :goto_6
    iput-object v11, v0, LV2/g;->p:Landroid/text/Layout$Alignment;

    .line 328
    .line 329
    :goto_7
    move-object/from16 v20, v3

    .line 330
    .line 331
    :goto_8
    const/4 v1, 0x4

    .line 332
    const/4 v3, 0x2

    .line 333
    const/4 v11, 0x3

    .line 334
    const/4 v15, 0x0

    .line 335
    const/16 v16, -0x1

    .line 336
    .line 337
    :goto_9
    const/16 v18, 0x1

    .line 338
    .line 339
    goto/16 :goto_24

    .line 340
    .line 341
    :pswitch_4
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    const/4 v11, 0x0

    .line 346
    :try_start_0
    invoke-static {v12, v11}, LQ1/b;->a(Ljava/lang/String;Z)I

    .line 347
    .line 348
    .line 349
    move-result v13

    .line 350
    iput v13, v0, LV2/g;->d:I

    .line 351
    .line 352
    const/4 v11, 0x1

    .line 353
    iput-boolean v11, v0, LV2/g;->e:Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :catch_0
    const-string v11, "Failed parsing background value: "

    .line 357
    .line 358
    invoke-static {v11, v12, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    goto :goto_7

    .line 362
    :pswitch_5
    invoke-static {v12}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v11

    .line 366
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v12

    .line 373
    if-nez v12, :cond_15

    .line 374
    .line 375
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v11

    .line 379
    if-nez v11, :cond_14

    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_14
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    const/4 v11, 0x2

    .line 387
    iput v11, v0, LV2/g;->n:I

    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_15
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    const/4 v11, 0x1

    .line 395
    iput v11, v0, LV2/g;->n:I

    .line 396
    .line 397
    goto :goto_7

    .line 398
    :pswitch_6
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    sget-object v11, LV2/b;->d:Ljava/util/regex/Pattern;

    .line 403
    .line 404
    if-nez v12, :cond_16

    .line 405
    .line 406
    :goto_a
    move-object/from16 v20, v3

    .line 407
    .line 408
    move-object/from16 v12, v17

    .line 409
    .line 410
    goto/16 :goto_16

    .line 411
    .line 412
    :cond_16
    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v11

    .line 416
    invoke-static {v11}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v11

    .line 420
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 421
    .line 422
    .line 423
    move-result v12

    .line 424
    if-eqz v12, :cond_17

    .line 425
    .line 426
    goto :goto_a

    .line 427
    :cond_17
    sget-object v12, LV2/b;->d:Ljava/util/regex/Pattern;

    .line 428
    .line 429
    invoke-static {v11, v12}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/util/regex/Pattern;)[Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v11

    .line 433
    array-length v12, v11

    .line 434
    if-eqz v12, :cond_19

    .line 435
    .line 436
    const/4 v13, 0x1

    .line 437
    if-eq v12, v13, :cond_18

    .line 438
    .line 439
    array-length v12, v11

    .line 440
    invoke-virtual {v11}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    check-cast v11, [Ljava/lang/Object;

    .line 445
    .line 446
    invoke-static {v12, v11}, Ll8/P;->i(I[Ljava/lang/Object;)Ll8/P;

    .line 447
    .line 448
    .line 449
    move-result-object v11

    .line 450
    goto :goto_b

    .line 451
    :cond_18
    const/16 v19, 0x0

    .line 452
    .line 453
    aget-object v11, v11, v19

    .line 454
    .line 455
    new-instance v12, Ll8/r0;

    .line 456
    .line 457
    invoke-direct {v12, v11}, Ll8/r0;-><init>(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    move-object v11, v12

    .line 461
    goto :goto_b

    .line 462
    :cond_19
    sget-object v11, Ll8/k0;->j:Ll8/k0;

    .line 463
    .line 464
    :goto_b
    sget-object v12, LV2/b;->h:Ll8/P;

    .line 465
    .line 466
    invoke-static {v12, v11}, Ll8/s;->l(Ll8/P;Ll8/P;)Ll8/n0;

    .line 467
    .line 468
    .line 469
    move-result-object v12

    .line 470
    const-string v13, "outside"

    .line 471
    .line 472
    invoke-static {v12, v13}, Ll8/s;->i(Ljava/util/AbstractCollection;Ljava/lang/String;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v12

    .line 476
    check-cast v12, Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 479
    .line 480
    .line 481
    move-result v15

    .line 482
    const v1, -0x5305c081

    .line 483
    .line 484
    .line 485
    if-eq v15, v1, :cond_1c

    .line 486
    .line 487
    const v1, -0x41ecca5b

    .line 488
    .line 489
    .line 490
    if-eq v15, v1, :cond_1b

    .line 491
    .line 492
    const v1, 0x58705dc

    .line 493
    .line 494
    .line 495
    if-eq v15, v1, :cond_1a

    .line 496
    .line 497
    goto :goto_c

    .line 498
    :cond_1a
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    if-eqz v1, :cond_1d

    .line 503
    .line 504
    const/4 v1, 0x0

    .line 505
    goto :goto_d

    .line 506
    :cond_1b
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    if-eqz v1, :cond_1d

    .line 511
    .line 512
    const/4 v1, 0x1

    .line 513
    goto :goto_d

    .line 514
    :cond_1c
    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    if-eqz v1, :cond_1d

    .line 519
    .line 520
    const/4 v1, 0x2

    .line 521
    goto :goto_d

    .line 522
    :cond_1d
    :goto_c
    const/4 v1, -0x1

    .line 523
    :goto_d
    if-eqz v1, :cond_1f

    .line 524
    .line 525
    const/4 v13, 0x1

    .line 526
    if-eq v1, v13, :cond_1e

    .line 527
    .line 528
    const/4 v1, 0x1

    .line 529
    goto :goto_e

    .line 530
    :cond_1e
    const/4 v1, -0x2

    .line 531
    goto :goto_e

    .line 532
    :cond_1f
    const/4 v1, 0x2

    .line 533
    :goto_e
    sget-object v12, LV2/b;->e:Ll8/P;

    .line 534
    .line 535
    invoke-static {v12, v11}, Ll8/s;->l(Ll8/P;Ll8/P;)Ll8/n0;

    .line 536
    .line 537
    .line 538
    move-result-object v12

    .line 539
    invoke-virtual {v12}, Ll8/n0;->isEmpty()Z

    .line 540
    .line 541
    .line 542
    move-result v13

    .line 543
    if-nez v13, :cond_23

    .line 544
    .line 545
    new-instance v11, Ll8/S;

    .line 546
    .line 547
    invoke-direct {v11, v12}, Ll8/S;-><init>(Ll8/n0;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v11}, Ll8/a;->next()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v11

    .line 554
    check-cast v11, Ljava/lang/String;

    .line 555
    .line 556
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 557
    .line 558
    .line 559
    move-result v12

    .line 560
    const v13, 0x2dddaf

    .line 561
    .line 562
    .line 563
    if-eq v12, v13, :cond_21

    .line 564
    .line 565
    const v13, 0x33af38

    .line 566
    .line 567
    .line 568
    if-eq v12, v13, :cond_20

    .line 569
    .line 570
    goto :goto_f

    .line 571
    :cond_20
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v11

    .line 575
    if-eqz v11, :cond_22

    .line 576
    .line 577
    const/4 v11, 0x0

    .line 578
    goto :goto_10

    .line 579
    :cond_21
    const-string v12, "auto"

    .line 580
    .line 581
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v11

    .line 585
    :cond_22
    :goto_f
    const/4 v11, -0x1

    .line 586
    :goto_10
    new-instance v12, LV2/b;

    .line 587
    .line 588
    const/4 v13, 0x0

    .line 589
    invoke-direct {v12, v11, v13, v1}, LV2/b;-><init>(III)V

    .line 590
    .line 591
    .line 592
    move-object/from16 v20, v3

    .line 593
    .line 594
    goto/16 :goto_16

    .line 595
    .line 596
    :cond_23
    const/4 v13, 0x0

    .line 597
    sget-object v12, LV2/b;->g:Ll8/P;

    .line 598
    .line 599
    invoke-static {v12, v11}, Ll8/s;->l(Ll8/P;Ll8/P;)Ll8/n0;

    .line 600
    .line 601
    .line 602
    move-result-object v12

    .line 603
    sget-object v15, LV2/b;->f:Ll8/P;

    .line 604
    .line 605
    invoke-static {v15, v11}, Ll8/s;->l(Ll8/P;Ll8/P;)Ll8/n0;

    .line 606
    .line 607
    .line 608
    move-result-object v11

    .line 609
    invoke-virtual {v12}, Ll8/n0;->isEmpty()Z

    .line 610
    .line 611
    .line 612
    move-result v15

    .line 613
    if-eqz v15, :cond_24

    .line 614
    .line 615
    invoke-virtual {v11}, Ll8/n0;->isEmpty()Z

    .line 616
    .line 617
    .line 618
    move-result v15

    .line 619
    if-eqz v15, :cond_24

    .line 620
    .line 621
    new-instance v11, LV2/b;

    .line 622
    .line 623
    const/4 v15, -0x1

    .line 624
    invoke-direct {v11, v15, v13, v1}, LV2/b;-><init>(III)V

    .line 625
    .line 626
    .line 627
    move-object/from16 v20, v3

    .line 628
    .line 629
    move-object v12, v11

    .line 630
    goto/16 :goto_16

    .line 631
    .line 632
    :cond_24
    const/4 v15, -0x1

    .line 633
    const-string v13, "filled"

    .line 634
    .line 635
    invoke-static {v12, v13}, Ll8/s;->i(Ljava/util/AbstractCollection;Ljava/lang/String;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v12

    .line 639
    check-cast v12, Ljava/lang/String;

    .line 640
    .line 641
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 642
    .line 643
    .line 644
    move-result v15

    .line 645
    move-object/from16 v20, v3

    .line 646
    .line 647
    const v3, -0x4bf7529e

    .line 648
    .line 649
    .line 650
    if-eq v15, v3, :cond_26

    .line 651
    .line 652
    const v3, 0x34264a

    .line 653
    .line 654
    .line 655
    if-eq v15, v3, :cond_25

    .line 656
    .line 657
    goto :goto_11

    .line 658
    :cond_25
    const-string v3, "open"

    .line 659
    .line 660
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    if-eqz v3, :cond_27

    .line 665
    .line 666
    const/4 v3, 0x2

    .line 667
    goto :goto_12

    .line 668
    :cond_26
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    :cond_27
    :goto_11
    const/4 v3, 0x1

    .line 673
    :goto_12
    const-string v12, "circle"

    .line 674
    .line 675
    invoke-static {v11, v12}, Ll8/s;->i(Ljava/util/AbstractCollection;Ljava/lang/String;)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v11

    .line 679
    check-cast v11, Ljava/lang/String;

    .line 680
    .line 681
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 682
    .line 683
    .line 684
    move-result v13

    .line 685
    const v15, -0x51134330

    .line 686
    .line 687
    .line 688
    if-eq v13, v15, :cond_2a

    .line 689
    .line 690
    const v12, -0x35fdaa48    # -2135406.0f

    .line 691
    .line 692
    .line 693
    if-eq v13, v12, :cond_29

    .line 694
    .line 695
    const v12, 0x18549

    .line 696
    .line 697
    .line 698
    if-eq v13, v12, :cond_28

    .line 699
    .line 700
    goto :goto_13

    .line 701
    :cond_28
    const-string v12, "dot"

    .line 702
    .line 703
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v11

    .line 707
    if-eqz v11, :cond_2b

    .line 708
    .line 709
    const/4 v11, 0x0

    .line 710
    goto :goto_14

    .line 711
    :cond_29
    const-string v12, "sesame"

    .line 712
    .line 713
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v11

    .line 717
    if-eqz v11, :cond_2b

    .line 718
    .line 719
    const/4 v11, 0x1

    .line 720
    goto :goto_14

    .line 721
    :cond_2a
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    move-result v11

    .line 725
    if-eqz v11, :cond_2b

    .line 726
    .line 727
    const/4 v11, 0x2

    .line 728
    goto :goto_14

    .line 729
    :cond_2b
    :goto_13
    const/4 v11, -0x1

    .line 730
    :goto_14
    if-eqz v11, :cond_2d

    .line 731
    .line 732
    const/4 v13, 0x1

    .line 733
    if-eq v11, v13, :cond_2c

    .line 734
    .line 735
    const/4 v11, 0x1

    .line 736
    goto :goto_15

    .line 737
    :cond_2c
    const/4 v11, 0x3

    .line 738
    goto :goto_15

    .line 739
    :cond_2d
    const/4 v11, 0x2

    .line 740
    :goto_15
    new-instance v12, LV2/b;

    .line 741
    .line 742
    invoke-direct {v12, v11, v3, v1}, LV2/b;-><init>(III)V

    .line 743
    .line 744
    .line 745
    :goto_16
    iput-object v12, v0, LV2/g;->r:LV2/b;

    .line 746
    .line 747
    goto/16 :goto_8

    .line 748
    .line 749
    :pswitch_7
    move-object/from16 v20, v3

    .line 750
    .line 751
    const/16 v16, -0x1

    .line 752
    .line 753
    :try_start_1
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-static {v12, v0}, LV2/e;->d(Ljava/lang/String;LV2/g;)V
    :try_end_1
    .catch LP2/f; {:try_start_1 .. :try_end_1} :catch_1

    .line 758
    .line 759
    .line 760
    :goto_17
    const/4 v1, 0x4

    .line 761
    const/4 v3, 0x2

    .line 762
    const/4 v11, 0x3

    .line 763
    :cond_2e
    :goto_18
    const/4 v15, 0x0

    .line 764
    goto/16 :goto_9

    .line 765
    .line 766
    :catch_1
    const-string v1, "Failed parsing fontSize value: "

    .line 767
    .line 768
    invoke-static {v1, v12, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    goto :goto_17

    .line 772
    :pswitch_8
    move-object/from16 v20, v3

    .line 773
    .line 774
    const/16 v16, -0x1

    .line 775
    .line 776
    invoke-static {v12}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    const-string v3, "all"

    .line 784
    .line 785
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    if-nez v3, :cond_30

    .line 790
    .line 791
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v1

    .line 795
    if-nez v1, :cond_2f

    .line 796
    .line 797
    goto :goto_17

    .line 798
    :cond_2f
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    const/4 v11, 0x0

    .line 803
    iput v11, v0, LV2/g;->q:I

    .line 804
    .line 805
    goto :goto_17

    .line 806
    :cond_30
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    const/4 v13, 0x1

    .line 811
    iput v13, v0, LV2/g;->q:I

    .line 812
    .line 813
    goto :goto_17

    .line 814
    :pswitch_9
    move-object/from16 v20, v3

    .line 815
    .line 816
    const/16 v16, -0x1

    .line 817
    .line 818
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    sget-object v0, LV2/e;->e:Ljava/util/regex/Pattern;

    .line 823
    .line 824
    invoke-virtual {v0, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 829
    .line 830
    .line 831
    move-result v3

    .line 832
    const v11, 0x7f7fffff    # Float.MAX_VALUE

    .line 833
    .line 834
    .line 835
    if-nez v3, :cond_31

    .line 836
    .line 837
    const-string v0, "Invalid value for shear: "

    .line 838
    .line 839
    invoke-static {v0, v12, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    goto :goto_19

    .line 843
    :cond_31
    const/4 v13, 0x1

    .line 844
    :try_start_2
    invoke-virtual {v0, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    const/high16 v3, -0x3d380000    # -100.0f

    .line 856
    .line 857
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 858
    .line 859
    .line 860
    move-result v0

    .line 861
    const/high16 v3, 0x42c80000    # 100.0f

    .line 862
    .line 863
    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    .line 864
    .line 865
    .line 866
    move-result v11
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 867
    goto :goto_19

    .line 868
    :catch_2
    move-exception v0

    .line 869
    new-instance v3, Ljava/lang/StringBuilder;

    .line 870
    .line 871
    const-string v13, "Failed to parse shear: "

    .line 872
    .line 873
    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v3

    .line 883
    invoke-static {v15, v3, v0}, LQ1/k;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 884
    .line 885
    .line 886
    :goto_19
    iput v11, v1, LV2/g;->s:F

    .line 887
    .line 888
    move-object v0, v1

    .line 889
    goto/16 :goto_17

    .line 890
    .line 891
    :pswitch_a
    move-object/from16 v20, v3

    .line 892
    .line 893
    const/16 v16, -0x1

    .line 894
    .line 895
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    const/4 v11, 0x0

    .line 900
    :try_start_3
    invoke-static {v12, v11}, LQ1/b;->a(Ljava/lang/String;Z)I

    .line 901
    .line 902
    .line 903
    move-result v1

    .line 904
    iput v1, v0, LV2/g;->b:I

    .line 905
    .line 906
    const/4 v13, 0x1

    .line 907
    iput-boolean v13, v0, LV2/g;->c:Z
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 908
    .line 909
    goto/16 :goto_17

    .line 910
    .line 911
    :catch_3
    const-string v1, "Failed parsing color value: "

    .line 912
    .line 913
    invoke-static {v1, v12, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 914
    .line 915
    .line 916
    goto/16 :goto_17

    .line 917
    .line 918
    :pswitch_b
    move-object/from16 v20, v3

    .line 919
    .line 920
    const/16 v16, -0x1

    .line 921
    .line 922
    invoke-static {v12}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 927
    .line 928
    .line 929
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 930
    .line 931
    .line 932
    move-result v3

    .line 933
    sparse-switch v3, :sswitch_data_2

    .line 934
    .line 935
    .line 936
    :goto_1a
    move/from16 v1, v16

    .line 937
    .line 938
    goto :goto_1b

    .line 939
    :sswitch_14
    const-string v3, "text"

    .line 940
    .line 941
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    move-result v1

    .line 945
    if-nez v1, :cond_32

    .line 946
    .line 947
    goto :goto_1a

    .line 948
    :cond_32
    const/4 v1, 0x5

    .line 949
    goto :goto_1b

    .line 950
    :sswitch_15
    const-string v3, "base"

    .line 951
    .line 952
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 953
    .line 954
    .line 955
    move-result v1

    .line 956
    if-nez v1, :cond_33

    .line 957
    .line 958
    goto :goto_1a

    .line 959
    :cond_33
    const/4 v1, 0x4

    .line 960
    goto :goto_1b

    .line 961
    :sswitch_16
    const-string v3, "textContainer"

    .line 962
    .line 963
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 964
    .line 965
    .line 966
    move-result v1

    .line 967
    if-nez v1, :cond_34

    .line 968
    .line 969
    goto :goto_1a

    .line 970
    :cond_34
    const/4 v1, 0x3

    .line 971
    goto :goto_1b

    .line 972
    :sswitch_17
    const-string v3, "delimiter"

    .line 973
    .line 974
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    move-result v1

    .line 978
    if-nez v1, :cond_35

    .line 979
    .line 980
    goto :goto_1a

    .line 981
    :cond_35
    const/4 v1, 0x2

    .line 982
    goto :goto_1b

    .line 983
    :sswitch_18
    const-string v3, "container"

    .line 984
    .line 985
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    move-result v1

    .line 989
    if-nez v1, :cond_36

    .line 990
    .line 991
    goto :goto_1a

    .line 992
    :cond_36
    const/4 v1, 0x1

    .line 993
    goto :goto_1b

    .line 994
    :sswitch_19
    const-string v3, "baseContainer"

    .line 995
    .line 996
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    move-result v1

    .line 1000
    if-nez v1, :cond_37

    .line 1001
    .line 1002
    goto :goto_1a

    .line 1003
    :cond_37
    const/4 v1, 0x0

    .line 1004
    :goto_1b
    packed-switch v1, :pswitch_data_2

    .line 1005
    .line 1006
    .line 1007
    goto/16 :goto_17

    .line 1008
    .line 1009
    :pswitch_c
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    const/4 v11, 0x3

    .line 1014
    iput v11, v0, LV2/g;->m:I

    .line 1015
    .line 1016
    const/4 v1, 0x4

    .line 1017
    :goto_1c
    const/4 v3, 0x2

    .line 1018
    goto/16 :goto_18

    .line 1019
    .line 1020
    :pswitch_d
    const/4 v11, 0x3

    .line 1021
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    const/4 v1, 0x4

    .line 1026
    iput v1, v0, LV2/g;->m:I

    .line 1027
    .line 1028
    goto :goto_1c

    .line 1029
    :pswitch_e
    const/4 v1, 0x4

    .line 1030
    const/4 v11, 0x3

    .line 1031
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    const/4 v13, 0x1

    .line 1036
    iput v13, v0, LV2/g;->m:I

    .line 1037
    .line 1038
    goto :goto_1c

    .line 1039
    :pswitch_f
    const/4 v1, 0x4

    .line 1040
    const/4 v11, 0x3

    .line 1041
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    const/4 v3, 0x2

    .line 1046
    iput v3, v0, LV2/g;->m:I

    .line 1047
    .line 1048
    goto/16 :goto_18

    .line 1049
    .line 1050
    :pswitch_10
    move-object/from16 v20, v3

    .line 1051
    .line 1052
    const/4 v1, 0x4

    .line 1053
    const/4 v3, 0x2

    .line 1054
    const/4 v11, 0x3

    .line 1055
    const/16 v16, -0x1

    .line 1056
    .line 1057
    const-string v13, "style"

    .line 1058
    .line 1059
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v15

    .line 1063
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v13

    .line 1067
    if-eqz v13, :cond_2e

    .line 1068
    .line 1069
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    iput-object v12, v0, LV2/g;->l:Ljava/lang/String;

    .line 1074
    .line 1075
    goto/16 :goto_18

    .line 1076
    .line 1077
    :pswitch_11
    move-object/from16 v20, v3

    .line 1078
    .line 1079
    const/4 v1, 0x4

    .line 1080
    const/4 v3, 0x2

    .line 1081
    const/4 v11, 0x3

    .line 1082
    const/16 v16, -0x1

    .line 1083
    .line 1084
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    const-string v13, "bold"

    .line 1089
    .line 1090
    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v12

    .line 1094
    iput v12, v0, LV2/g;->h:I

    .line 1095
    .line 1096
    goto/16 :goto_18

    .line 1097
    .line 1098
    :pswitch_12
    move-object/from16 v20, v3

    .line 1099
    .line 1100
    const/4 v1, 0x4

    .line 1101
    const/4 v3, 0x2

    .line 1102
    const/4 v11, 0x3

    .line 1103
    const/16 v16, -0x1

    .line 1104
    .line 1105
    invoke-static {v12}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v12

    .line 1109
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 1113
    .line 1114
    .line 1115
    move-result v13

    .line 1116
    sparse-switch v13, :sswitch_data_3

    .line 1117
    .line 1118
    .line 1119
    :goto_1d
    move/from16 v12, v16

    .line 1120
    .line 1121
    goto :goto_1e

    .line 1122
    :sswitch_1a
    const-string v13, "linethrough"

    .line 1123
    .line 1124
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v12

    .line 1128
    if-nez v12, :cond_38

    .line 1129
    .line 1130
    goto :goto_1d

    .line 1131
    :cond_38
    move v12, v11

    .line 1132
    goto :goto_1e

    .line 1133
    :sswitch_1b
    const-string v13, "nolinethrough"

    .line 1134
    .line 1135
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1136
    .line 1137
    .line 1138
    move-result v12

    .line 1139
    if-nez v12, :cond_39

    .line 1140
    .line 1141
    goto :goto_1d

    .line 1142
    :cond_39
    move v12, v3

    .line 1143
    goto :goto_1e

    .line 1144
    :sswitch_1c
    const-string v13, "underline"

    .line 1145
    .line 1146
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v12

    .line 1150
    if-nez v12, :cond_3a

    .line 1151
    .line 1152
    goto :goto_1d

    .line 1153
    :cond_3a
    const/4 v12, 0x1

    .line 1154
    goto :goto_1e

    .line 1155
    :sswitch_1d
    const-string v13, "nounderline"

    .line 1156
    .line 1157
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v12

    .line 1161
    if-nez v12, :cond_3b

    .line 1162
    .line 1163
    goto :goto_1d

    .line 1164
    :cond_3b
    const/4 v12, 0x0

    .line 1165
    :goto_1e
    packed-switch v12, :pswitch_data_3

    .line 1166
    .line 1167
    .line 1168
    :goto_1f
    goto/16 :goto_18

    .line 1169
    .line 1170
    :pswitch_13
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v0

    .line 1174
    const/4 v13, 0x1

    .line 1175
    iput v13, v0, LV2/g;->f:I

    .line 1176
    .line 1177
    goto :goto_1f

    .line 1178
    :pswitch_14
    const/4 v13, 0x1

    .line 1179
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    const/4 v15, 0x0

    .line 1184
    iput v15, v0, LV2/g;->f:I

    .line 1185
    .line 1186
    goto/16 :goto_9

    .line 1187
    .line 1188
    :pswitch_15
    const/4 v13, 0x1

    .line 1189
    const/4 v15, 0x0

    .line 1190
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    iput v13, v0, LV2/g;->g:I

    .line 1195
    .line 1196
    goto/16 :goto_9

    .line 1197
    .line 1198
    :pswitch_16
    const/4 v15, 0x0

    .line 1199
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    iput v15, v0, LV2/g;->g:I

    .line 1204
    .line 1205
    goto/16 :goto_9

    .line 1206
    .line 1207
    :pswitch_17
    move-object/from16 v20, v3

    .line 1208
    .line 1209
    const/4 v1, 0x4

    .line 1210
    const/4 v3, 0x2

    .line 1211
    const/4 v11, 0x3

    .line 1212
    const/4 v15, 0x0

    .line 1213
    const/16 v16, -0x1

    .line 1214
    .line 1215
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0

    .line 1219
    invoke-static {v12}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v12

    .line 1223
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 1227
    .line 1228
    .line 1229
    move-result v13

    .line 1230
    sparse-switch v13, :sswitch_data_4

    .line 1231
    .line 1232
    .line 1233
    :goto_20
    move/from16 v12, v16

    .line 1234
    .line 1235
    goto :goto_21

    .line 1236
    :sswitch_1e
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v12

    .line 1240
    if-nez v12, :cond_3c

    .line 1241
    .line 1242
    goto :goto_20

    .line 1243
    :cond_3c
    move v12, v1

    .line 1244
    goto :goto_21

    .line 1245
    :sswitch_1f
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1246
    .line 1247
    .line 1248
    move-result v12

    .line 1249
    if-nez v12, :cond_3d

    .line 1250
    .line 1251
    goto :goto_20

    .line 1252
    :cond_3d
    move v12, v11

    .line 1253
    goto :goto_21

    .line 1254
    :sswitch_20
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1255
    .line 1256
    .line 1257
    move-result v12

    .line 1258
    if-nez v12, :cond_3e

    .line 1259
    .line 1260
    goto :goto_20

    .line 1261
    :cond_3e
    move v12, v3

    .line 1262
    goto :goto_21

    .line 1263
    :sswitch_21
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1264
    .line 1265
    .line 1266
    move-result v12

    .line 1267
    if-nez v12, :cond_3f

    .line 1268
    .line 1269
    goto :goto_20

    .line 1270
    :cond_3f
    const/4 v12, 0x1

    .line 1271
    goto :goto_21

    .line 1272
    :sswitch_22
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v12

    .line 1276
    if-nez v12, :cond_40

    .line 1277
    .line 1278
    goto :goto_20

    .line 1279
    :cond_40
    move v12, v15

    .line 1280
    :goto_21
    packed-switch v12, :pswitch_data_4

    .line 1281
    .line 1282
    .line 1283
    :goto_22
    move-object/from16 v12, v17

    .line 1284
    .line 1285
    goto :goto_23

    .line 1286
    :pswitch_18
    sget-object v17, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 1287
    .line 1288
    goto :goto_22

    .line 1289
    :pswitch_19
    sget-object v17, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 1290
    .line 1291
    goto :goto_22

    .line 1292
    :pswitch_1a
    sget-object v17, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 1293
    .line 1294
    goto :goto_22

    .line 1295
    :goto_23
    iput-object v12, v0, LV2/g;->o:Landroid/text/Layout$Alignment;

    .line 1296
    .line 1297
    goto/16 :goto_9

    .line 1298
    .line 1299
    :pswitch_1b
    move-object/from16 v20, v3

    .line 1300
    .line 1301
    const/4 v1, 0x4

    .line 1302
    const/4 v3, 0x2

    .line 1303
    const/4 v11, 0x3

    .line 1304
    const/4 v15, 0x0

    .line 1305
    const/16 v16, -0x1

    .line 1306
    .line 1307
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v0

    .line 1311
    iput-object v12, v0, LV2/g;->a:Ljava/lang/String;

    .line 1312
    .line 1313
    goto/16 :goto_9

    .line 1314
    .line 1315
    :pswitch_1c
    move-object/from16 v20, v3

    .line 1316
    .line 1317
    const/4 v1, 0x4

    .line 1318
    const/4 v3, 0x2

    .line 1319
    const/4 v11, 0x3

    .line 1320
    const/4 v15, 0x0

    .line 1321
    const/16 v16, -0x1

    .line 1322
    .line 1323
    invoke-static {v0}, LV2/e;->a(LV2/g;)LV2/g;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v0

    .line 1327
    const-string v13, "italic"

    .line 1328
    .line 1329
    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1330
    .line 1331
    .line 1332
    move-result v12

    .line 1333
    iput v12, v0, LV2/g;->i:I

    .line 1334
    .line 1335
    goto/16 :goto_9

    .line 1336
    .line 1337
    :goto_24
    add-int/lit8 v14, v14, 0x1

    .line 1338
    .line 1339
    move-object/from16 v1, p0

    .line 1340
    .line 1341
    move-object/from16 v3, v20

    .line 1342
    .line 1343
    goto/16 :goto_0

    .line 1344
    .line 1345
    :cond_41
    return-object v0

    .line 1346
    nop

    .line 1347
    :sswitch_data_0
    .sparse-switch
        -0x5c71855e -> :sswitch_e
        -0x48ff636d -> :sswitch_d
        -0x3f826a28 -> :sswitch_c
        -0x3468fa43 -> :sswitch_b
        -0x2bc67c59 -> :sswitch_a
        0xd1b -> :sswitch_9
        0x3595da -> :sswitch_8
        0x5a72f63 -> :sswitch_7
        0x6855ce1 -> :sswitch_6
        0x6909352 -> :sswitch_5
        0x15caa0f0 -> :sswitch_4
        0x36e741c9 -> :sswitch_3
        0x42841923 -> :sswitch_2
        0x4cb7f6d5 -> :sswitch_1
        0x6899f5a4 -> :sswitch_0
    .end sparse-switch

    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_17
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch

    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    :sswitch_data_1
    .sparse-switch
        -0x514d33ab -> :sswitch_13
        0x188db -> :sswitch_12
        0x32a007 -> :sswitch_11
        0x677c21c -> :sswitch_10
        0x68ac462 -> :sswitch_f
    .end sparse-switch

    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    :sswitch_data_2
    .sparse-switch
        -0x24de7f50 -> :sswitch_19
        -0x187eb37f -> :sswitch_18
        -0xeee99f9 -> :sswitch_17
        -0x81c562c -> :sswitch_16
        0x2e06d1 -> :sswitch_15
        0x36452d -> :sswitch_14
    .end sparse-switch

    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_f
        :pswitch_c
    .end packed-switch

    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    :sswitch_data_3
    .sparse-switch
        -0x57195dd5 -> :sswitch_1d
        -0x3d363934 -> :sswitch_1c
        0x36723ff0 -> :sswitch_1b
        0x641ec051 -> :sswitch_1a
    .end sparse-switch

    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    :sswitch_data_4
    .sparse-switch
        -0x514d33ab -> :sswitch_22
        0x188db -> :sswitch_21
        0x32a007 -> :sswitch_20
        0x677c21c -> :sswitch_1f
        0x68ac462 -> :sswitch_1e
    .end sparse-switch

    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
    .end packed-switch
.end method

.method public static i(Ljava/lang/String;LV2/d;)J
    .locals 13

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    sget-object v2, LV2/e;->b:Ljava/util/regex/Pattern;

    .line 4
    .line 5
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const-wide v4, 0x412e848000000000L    # 1000000.0

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const/4 v6, 0x2

    .line 19
    const/4 v7, 0x1

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    const-wide/16 v9, 0xe10

    .line 34
    .line 35
    mul-long/2addr v7, v9

    .line 36
    long-to-double v7, v7

    .line 37
    invoke-virtual {v2, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v9

    .line 48
    const-wide/16 v11, 0x3c

    .line 49
    .line 50
    mul-long/2addr v9, v11

    .line 51
    long-to-double v9, v9

    .line 52
    add-double/2addr v7, v9

    .line 53
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    long-to-double v9, v9

    .line 65
    add-double/2addr v7, v9

    .line 66
    invoke-virtual {v2, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-wide/16 v0, 0x0

    .line 71
    .line 72
    if-eqz p0, :cond_0

    .line 73
    .line 74
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 75
    .line 76
    .line 77
    move-result-wide v9

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-wide v9, v0

    .line 80
    :goto_0
    add-double/2addr v7, v9

    .line 81
    const/4 p0, 0x5

    .line 82
    invoke-virtual {v2, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-eqz p0, :cond_1

    .line 87
    .line 88
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v9

    .line 92
    long-to-float p0, v9

    .line 93
    iget v3, p1, LV2/d;->a:F

    .line 94
    .line 95
    div-float/2addr p0, v3

    .line 96
    float-to-double v9, p0

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    move-wide v9, v0

    .line 99
    :goto_1
    add-double/2addr v7, v9

    .line 100
    const/4 p0, 0x6

    .line 101
    invoke-virtual {v2, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-eqz p0, :cond_2

    .line 106
    .line 107
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    long-to-double v0, v0

    .line 112
    iget p0, p1, LV2/d;->b:I

    .line 113
    .line 114
    int-to-double v2, p0

    .line 115
    div-double/2addr v0, v2

    .line 116
    iget p0, p1, LV2/d;->a:F

    .line 117
    .line 118
    float-to-double p0, p0

    .line 119
    div-double/2addr v0, p0

    .line 120
    :cond_2
    add-double/2addr v7, v0

    .line 121
    mul-double/2addr v7, v4

    .line 122
    double-to-long p0, v7

    .line 123
    return-wide p0

    .line 124
    :cond_3
    sget-object v2, LV2/e;->c:Ljava/util/regex/Pattern;

    .line 125
    .line 126
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_9

    .line 135
    .line 136
    invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 144
    .line 145
    .line 146
    move-result-wide v8

    .line 147
    invoke-virtual {v2, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    const/4 v2, -0x1

    .line 155
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    sparse-switch v3, :sswitch_data_0

    .line 160
    .line 161
    .line 162
    :goto_2
    move v0, v2

    .line 163
    goto :goto_3

    .line 164
    :sswitch_0
    const-string v1, "ms"

    .line 165
    .line 166
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    if-nez p0, :cond_8

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :sswitch_1
    const-string v0, "t"

    .line 174
    .line 175
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    if-nez p0, :cond_4

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_4
    move v0, v1

    .line 183
    goto :goto_3

    .line 184
    :sswitch_2
    const-string v0, "m"

    .line 185
    .line 186
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-nez p0, :cond_5

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_5
    move v0, v6

    .line 194
    goto :goto_3

    .line 195
    :sswitch_3
    const-string v0, "h"

    .line 196
    .line 197
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-nez p0, :cond_6

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_6
    move v0, v7

    .line 205
    goto :goto_3

    .line 206
    :sswitch_4
    const-string v0, "f"

    .line 207
    .line 208
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    if-nez p0, :cond_7

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_7
    const/4 v0, 0x0

    .line 216
    :cond_8
    :goto_3
    packed-switch v0, :pswitch_data_0

    .line 217
    .line 218
    .line 219
    goto :goto_6

    .line 220
    :pswitch_0
    const-wide p0, 0x408f400000000000L    # 1000.0

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    :goto_4
    div-double/2addr v8, p0

    .line 226
    goto :goto_6

    .line 227
    :pswitch_1
    iget p0, p1, LV2/d;->c:I

    .line 228
    .line 229
    int-to-double p0, p0

    .line 230
    goto :goto_4

    .line 231
    :pswitch_2
    const-wide/high16 p0, 0x404e000000000000L    # 60.0

    .line 232
    .line 233
    :goto_5
    mul-double/2addr v8, p0

    .line 234
    goto :goto_6

    .line 235
    :pswitch_3
    const-wide p0, 0x40ac200000000000L    # 3600.0

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :pswitch_4
    iget p0, p1, LV2/d;->a:F

    .line 242
    .line 243
    float-to-double p0, p0

    .line 244
    goto :goto_4

    .line 245
    :goto_6
    mul-double/2addr v8, v4

    .line 246
    double-to-long p0, v8

    .line 247
    return-wide p0

    .line 248
    :cond_9
    new-instance p1, LP2/f;

    .line 249
    .line 250
    const-string v0, "Malformed time expression: "

    .line 251
    .line 252
    invoke-static {v0, p0}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw p1

    .line 260
    nop

    .line 261
    :sswitch_data_0
    .sparse-switch
        0x66 -> :sswitch_4
        0x68 -> :sswitch_3
        0x6d -> :sswitch_2
        0x74 -> :sswitch_1
        0xda6 -> :sswitch_0
    .end sparse-switch

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static j(Lorg/xmlpull/v1/XmlPullParser;)LD9/n;
    .locals 6

    .line 1
    const-string v0, "extent"

    .line 2
    .line 3
    invoke-static {p0, v0}, LQ1/k;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    sget-object v1, LV2/e;->g:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const-string v3, "TtmlParser"

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const-string v1, "Ignoring non-pixel tts extent: "

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {v3, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    const/4 v2, 0x1

    .line 36
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v4, 0x2

    .line 48
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    new-instance v4, LD9/n;

    .line 60
    .line 61
    const/4 v5, 0x7

    .line 62
    invoke-direct {v4, v2, v1, v5}, LD9/n;-><init>(III)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    return-object v4

    .line 66
    :catch_0
    const-string v1, "Ignoring malformed tts extent: "

    .line 67
    .line 68
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {v3, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method


# virtual methods
.method public final E([BIILP2/k;LQ1/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2, p3, p1}, LV2/e;->H(II[B)LP2/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p4, p5}, LU8/v0;->n0(LP2/d;LP2/k;LQ1/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final H(II[B)LP2/d;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, v1, LV2/e;->a:Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v6, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v7, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v0, ""

    .line 25
    .line 26
    new-instance v8, LV2/f;

    .line 27
    .line 28
    const-string v9, ""

    .line 29
    .line 30
    const/high16 v13, -0x80000000

    .line 31
    .line 32
    const v14, -0x800001

    .line 33
    .line 34
    .line 35
    const v15, -0x800001

    .line 36
    .line 37
    .line 38
    const/high16 v16, -0x80000000

    .line 39
    .line 40
    const v17, -0x800001

    .line 41
    .line 42
    .line 43
    const/high16 v18, -0x80000000

    .line 44
    .line 45
    const v10, -0x800001

    .line 46
    .line 47
    .line 48
    const v11, -0x800001

    .line 49
    .line 50
    .line 51
    const/high16 v12, -0x80000000

    .line 52
    .line 53
    invoke-direct/range {v8 .. v18}, LV2/f;-><init>(Ljava/lang/String;FFIIFFIFI)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6, v0, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 60
    .line 61
    move/from16 v4, p1

    .line 62
    .line 63
    move/from16 v5, p2

    .line 64
    .line 65
    move-object/from16 v8, p3

    .line 66
    .line 67
    invoke-direct {v0, v8, v4, v5}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 68
    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-interface {v2, v0, v4}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v8, Ljava/util/ArrayDeque;

    .line 75
    .line 76
    invoke-direct {v8}, Ljava/util/ArrayDeque;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    sget-object v5, LV2/e;->i:LV2/d;

    .line 84
    .line 85
    const/16 v9, 0xf

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    move v11, v10

    .line 89
    move v10, v9

    .line 90
    move-object v9, v4

    .line 91
    :goto_0
    const/4 v12, 0x1

    .line 92
    if-eq v0, v12, :cond_c

    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    check-cast v12, LV2/c;

    .line 99
    .line 100
    const/4 v14, 0x2

    .line 101
    if-nez v11, :cond_9

    .line 102
    .line 103
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v15
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    const-string v13, "tt"

    .line 108
    .line 109
    if-ne v0, v14, :cond_5

    .line 110
    .line 111
    :try_start_1
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_0

    .line 116
    .line 117
    invoke-static {v2}, LV2/e;->e(Lorg/xmlpull/v1/XmlPullParser;)LV2/d;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-static {v2}, LV2/e;->c(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    invoke-static {v2}, LV2/e;->j(Lorg/xmlpull/v1/XmlPullParser;)LD9/n;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    :cond_0
    move-object/from16 v19, v5

    .line 130
    .line 131
    move-object v5, v4

    .line 132
    move v4, v10

    .line 133
    move-object/from16 v10, v19

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :catch_0
    move-exception v0

    .line 137
    goto/16 :goto_5

    .line 138
    .line 139
    :catch_1
    move-exception v0

    .line 140
    goto/16 :goto_6

    .line 141
    .line 142
    :goto_1
    invoke-static {v15}, LV2/e;->b(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    const-string v13, "TtmlParser"

    .line 147
    .line 148
    if-nez v0, :cond_2

    .line 149
    .line 150
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v12, "Ignoring unsupported tag: "

    .line 156
    .line 157
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-static {v13, v0}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :goto_2
    add-int/lit8 v11, v11, 0x1

    .line 175
    .line 176
    :cond_1
    :goto_3
    move-object/from16 v19, v10

    .line 177
    .line 178
    move v10, v4

    .line 179
    move-object v4, v5

    .line 180
    move-object/from16 v5, v19

    .line 181
    .line 182
    goto/16 :goto_4

    .line 183
    .line 184
    :cond_2
    const-string v0, "head"

    .line 185
    .line 186
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_3

    .line 191
    .line 192
    invoke-static/range {v2 .. v7}, LV2/e;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/HashMap;ILD9/n;Ljava/util/HashMap;Ljava/util/HashMap;)V
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_3
    :try_start_3
    invoke-static {v2, v12, v6, v10}, LV2/e;->g(Lorg/xmlpull/v1/XmlPullParser;LV2/c;Ljava/util/HashMap;LV2/d;)LV2/c;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v8, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    if-eqz v12, :cond_1

    .line 204
    .line 205
    iget-object v14, v12, LV2/c;->m:Ljava/util/ArrayList;

    .line 206
    .line 207
    if-nez v14, :cond_4

    .line 208
    .line 209
    new-instance v14, Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 212
    .line 213
    .line 214
    iput-object v14, v12, LV2/c;->m:Ljava/util/ArrayList;

    .line 215
    .line 216
    :cond_4
    iget-object v12, v12, LV2/c;->m:Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch LP2/f; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 219
    .line 220
    .line 221
    goto :goto_3

    .line 222
    :catch_2
    move-exception v0

    .line 223
    :try_start_4
    const-string v12, "Suppressing parser error"

    .line 224
    .line 225
    invoke-static {v13, v12, v0}, LQ1/k;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_5
    const/4 v14, 0x4

    .line 230
    if-ne v0, v14, :cond_7

    .line 231
    .line 232
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v0}, LV2/c;->a(Ljava/lang/String;)LV2/c;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget-object v13, v12, LV2/c;->m:Ljava/util/ArrayList;

    .line 244
    .line 245
    if-nez v13, :cond_6

    .line 246
    .line 247
    new-instance v13, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    iput-object v13, v12, LV2/c;->m:Ljava/util/ArrayList;

    .line 253
    .line 254
    :cond_6
    iget-object v12, v12, LV2/c;->m:Ljava/util/ArrayList;

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_7
    const/4 v12, 0x3

    .line 261
    if-ne v0, v12, :cond_b

    .line 262
    .line 263
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_8

    .line 272
    .line 273
    new-instance v9, LC8/i;

    .line 274
    .line 275
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    check-cast v0, LV2/c;

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-direct {v9, v0, v3, v6, v7}, LC8/i;-><init>(LV2/c;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 285
    .line 286
    .line 287
    :cond_8
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_9
    if-ne v0, v14, :cond_a

    .line 292
    .line 293
    add-int/lit8 v11, v11, 0x1

    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_a
    const/4 v12, 0x3

    .line 297
    if-ne v0, v12, :cond_b

    .line 298
    .line 299
    add-int/lit8 v11, v11, -0x1

    .line 300
    .line 301
    :cond_b
    :goto_4
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 302
    .line 303
    .line 304
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :cond_c
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 311
    .line 312
    .line 313
    return-object v9

    .line 314
    :goto_5
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 315
    .line 316
    const-string v3, "Unexpected error when reading input."

    .line 317
    .line 318
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 319
    .line 320
    .line 321
    throw v2

    .line 322
    :goto_6
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 323
    .line 324
    const-string v3, "Unable to decode source"

    .line 325
    .line 326
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    throw v2
.end method

.method public final P()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final synthetic reset()V
    .locals 0

    .line 1
    return-void
.end method
