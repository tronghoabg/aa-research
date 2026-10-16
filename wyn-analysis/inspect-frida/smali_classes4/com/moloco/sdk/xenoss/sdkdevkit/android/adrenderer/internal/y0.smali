.class public abstract Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LBf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LBf/i;

    .line 2
    .line 3
    sget-object v1, LBf/j;->a:[LBf/j;

    .line 4
    .line 5
    const/16 v1, 0x42

    .line 6
    .line 7
    const-string v2, "<meta\\s+name=[\"\']templateName[\"\']\\s+content=[\"\']([^\"\']+)[\"\']"

    .line 8
    .line 9
    invoke-static {v2, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "compile(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/util/regex/Pattern;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/y0;->a:LBf/i;

    .line 22
    .line 23
    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;
    .locals 4

    .line 1
    const-string v0, "adm"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/y0;->a:LBf/i;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, LBf/i;->a:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "matcher(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->find(I)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    move-object v1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v1, LBf/f;

    .line 33
    .line 34
    invoke-direct {v1, v0, p0}, LBf/f;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    const/4 v0, 0x1

    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    invoke-virtual {v1}, LBf/f;->a()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, LBf/e;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, LBf/e;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const-string v2, "video"

    .line 56
    .line 57
    invoke-static {v1, v2, v0}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const-string v2, "mraid"

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const-string v2, "static"

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    sget-object v2, Lcom/moloco/sdk/acm/recorder/b;->Companion:Lcom/moloco/sdk/acm/recorder/a;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v2, Lcom/moloco/sdk/acm/h;

    .line 94
    .line 95
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 96
    .line 97
    const-string v3, "unknown_creative_type"

    .line 98
    .line 99
    invoke-direct {v2, v3}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v3, "template_name"

    .line 103
    .line 104
    invoke-virtual {v2, v3, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sget-object v1, Lcom/moloco/sdk/acm/f;->a:Lcom/moloco/sdk/acm/f;

    .line 108
    .line 109
    invoke-static {v2}, Lcom/moloco/sdk/acm/f;->a(Lcom/moloco/sdk/acm/h;)V

    .line 110
    .line 111
    .line 112
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 113
    .line 114
    :cond_5
    :goto_1
    if-nez v2, :cond_8

    .line 115
    .line 116
    const-string v1, "<VAST"

    .line 117
    .line 118
    invoke-static {p0, v1, v0}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_6

    .line 123
    .line 124
    sget-object p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_6
    const-string v1, "mraid.js"

    .line 128
    .line 129
    invoke-static {p0, v1, v0}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_7

    .line 134
    .line 135
    sget-object p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 136
    .line 137
    return-object p0

    .line 138
    :cond_7
    sget-object p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 139
    .line 140
    return-object p0

    .line 141
    :cond_8
    return-object v2
.end method
