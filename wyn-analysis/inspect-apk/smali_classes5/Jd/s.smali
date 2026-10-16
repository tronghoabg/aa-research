.class public final LJd/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LJd/s;

.field public static final c:LJd/s;

.field public static final d:LJd/s;

.field public static final e:LJd/s;

.field public static final f:Ljava/util/List;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, LJd/s;

    .line 2
    .line 3
    const-string v1, "GET"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LJd/s;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LJd/s;->b:LJd/s;

    .line 9
    .line 10
    new-instance v1, LJd/s;

    .line 11
    .line 12
    const-string v2, "POST"

    .line 13
    .line 14
    invoke-direct {v1, v2}, LJd/s;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, LJd/s;->c:LJd/s;

    .line 18
    .line 19
    new-instance v2, LJd/s;

    .line 20
    .line 21
    const-string v3, "PUT"

    .line 22
    .line 23
    invoke-direct {v2, v3}, LJd/s;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v3, LJd/s;

    .line 27
    .line 28
    const-string v4, "PATCH"

    .line 29
    .line 30
    invoke-direct {v3, v4}, LJd/s;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v4, LJd/s;

    .line 34
    .line 35
    const-string v5, "DELETE"

    .line 36
    .line 37
    invoke-direct {v4, v5}, LJd/s;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v5, LJd/s;

    .line 41
    .line 42
    const-string v6, "HEAD"

    .line 43
    .line 44
    invoke-direct {v5, v6}, LJd/s;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v5, LJd/s;->d:LJd/s;

    .line 48
    .line 49
    new-instance v6, LJd/s;

    .line 50
    .line 51
    const-string v7, "OPTIONS"

    .line 52
    .line 53
    invoke-direct {v6, v7}, LJd/s;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sput-object v6, LJd/s;->e:LJd/s;

    .line 57
    .line 58
    const/4 v7, 0x7

    .line 59
    new-array v7, v7, [LJd/s;

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    aput-object v0, v7, v8

    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    aput-object v1, v7, v0

    .line 66
    .line 67
    const/4 v0, 0x2

    .line 68
    aput-object v2, v7, v0

    .line 69
    .line 70
    const/4 v0, 0x3

    .line 71
    aput-object v3, v7, v0

    .line 72
    .line 73
    const/4 v0, 0x4

    .line 74
    aput-object v4, v7, v0

    .line 75
    .line 76
    const/4 v0, 0x5

    .line 77
    aput-object v5, v7, v0

    .line 78
    .line 79
    const/4 v0, 0x6

    .line 80
    aput-object v6, v7, v0

    .line 81
    .line 82
    invoke-static {v7}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sput-object v0, LJd/s;->f:Ljava/util/List;

    .line 87
    .line 88
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJd/s;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LJd/s;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LJd/s;

    .line 12
    .line 13
    iget-object v1, p0, LJd/s;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p1, p1, LJd/s;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LJd/s;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LJd/s;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
