.class public abstract LJd/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LJd/s;

    .line 2
    .line 3
    const-string v1, "TRACE"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LJd/s;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    new-array v1, v1, [LJd/s;

    .line 10
    .line 11
    sget-object v2, LJd/s;->b:LJd/s;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput-object v2, v1, v3

    .line 15
    .line 16
    sget-object v2, LJd/s;->d:LJd/s;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    aput-object v2, v1, v3

    .line 20
    .line 21
    sget-object v2, LJd/s;->e:LJd/s;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    aput-object v2, v1, v3

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    aput-object v0, v1, v2

    .line 28
    .line 29
    invoke-static {v1}, Lff/m;->P0([Ljava/lang/Object;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, LJd/t;->a:Ljava/util/Set;

    .line 34
    .line 35
    return-void
.end method
