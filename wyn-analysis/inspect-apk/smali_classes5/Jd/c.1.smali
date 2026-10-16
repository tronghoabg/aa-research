.class public abstract LJd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJd/f;

.field public static final b:LJd/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LJd/f;

    .line 2
    .line 3
    sget-object v1, Lff/v;->a:Lff/v;

    .line 4
    .line 5
    const-string v2, "application"

    .line 6
    .line 7
    const-string v3, "*"

    .line 8
    .line 9
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, LJd/f;

    .line 13
    .line 14
    const-string v3, "atom+xml"

    .line 15
    .line 16
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, LJd/f;

    .line 20
    .line 21
    const-string v3, "cbor"

    .line 22
    .line 23
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, LJd/f;

    .line 27
    .line 28
    const-string v3, "json"

    .line 29
    .line 30
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, LJd/f;

    .line 34
    .line 35
    const-string v3, "hal+json"

    .line 36
    .line 37
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, LJd/f;

    .line 41
    .line 42
    const-string v3, "javascript"

    .line 43
    .line 44
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, LJd/f;

    .line 48
    .line 49
    const-string v3, "octet-stream"

    .line 50
    .line 51
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    sput-object v0, LJd/c;->a:LJd/f;

    .line 55
    .line 56
    new-instance v0, LJd/f;

    .line 57
    .line 58
    const-string v3, "rss+xml"

    .line 59
    .line 60
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, LJd/f;

    .line 64
    .line 65
    const-string v3, "soap+xml"

    .line 66
    .line 67
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, LJd/f;

    .line 71
    .line 72
    const-string v3, "xml"

    .line 73
    .line 74
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, LJd/f;

    .line 78
    .line 79
    const-string v3, "xml-dtd"

    .line 80
    .line 81
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, LJd/f;

    .line 85
    .line 86
    const-string v3, "yaml"

    .line 87
    .line 88
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    new-instance v0, LJd/f;

    .line 92
    .line 93
    const-string v3, "zip"

    .line 94
    .line 95
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, LJd/f;

    .line 99
    .line 100
    const-string v3, "gzip"

    .line 101
    .line 102
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, LJd/f;

    .line 106
    .line 107
    const-string v3, "x-www-form-urlencoded"

    .line 108
    .line 109
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    new-instance v0, LJd/f;

    .line 113
    .line 114
    const-string v3, "pdf"

    .line 115
    .line 116
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    new-instance v0, LJd/f;

    .line 120
    .line 121
    const-string v3, "vnd.openxmlformats-officedocument.spreadsheetml.sheet"

    .line 122
    .line 123
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 124
    .line 125
    .line 126
    new-instance v0, LJd/f;

    .line 127
    .line 128
    const-string v3, "vnd.openxmlformats-officedocument.wordprocessingml.document"

    .line 129
    .line 130
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    new-instance v0, LJd/f;

    .line 134
    .line 135
    const-string v3, "vnd.openxmlformats-officedocument.presentationml.presentation"

    .line 136
    .line 137
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 138
    .line 139
    .line 140
    new-instance v0, LJd/f;

    .line 141
    .line 142
    const-string v3, "protobuf"

    .line 143
    .line 144
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 145
    .line 146
    .line 147
    sput-object v0, LJd/c;->b:LJd/f;

    .line 148
    .line 149
    new-instance v0, LJd/f;

    .line 150
    .line 151
    const-string v3, "wasm"

    .line 152
    .line 153
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 154
    .line 155
    .line 156
    new-instance v0, LJd/f;

    .line 157
    .line 158
    const-string v3, "problem+json"

    .line 159
    .line 160
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 161
    .line 162
    .line 163
    new-instance v0, LJd/f;

    .line 164
    .line 165
    const-string v3, "problem+xml"

    .line 166
    .line 167
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    return-void
.end method
