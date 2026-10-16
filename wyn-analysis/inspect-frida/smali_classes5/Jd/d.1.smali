.class public abstract LJd/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJd/f;


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
    const-string v2, "multipart"

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
    const-string v3, "mixed"

    .line 15
    .line 16
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, LJd/f;

    .line 20
    .line 21
    const-string v3, "alternative"

    .line 22
    .line 23
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, LJd/f;

    .line 27
    .line 28
    const-string v3, "related"

    .line 29
    .line 30
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, LJd/f;

    .line 34
    .line 35
    const-string v3, "form-data"

    .line 36
    .line 37
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, LJd/d;->a:LJd/f;

    .line 41
    .line 42
    new-instance v0, LJd/f;

    .line 43
    .line 44
    const-string v3, "signed"

    .line 45
    .line 46
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, LJd/f;

    .line 50
    .line 51
    const-string v3, "encrypted"

    .line 52
    .line 53
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, LJd/f;

    .line 57
    .line 58
    const-string v3, "byteranges"

    .line 59
    .line 60
    invoke-direct {v0, v2, v3, v1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
