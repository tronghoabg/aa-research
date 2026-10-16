.class public final Lio/ktor/utils/io/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/List;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v2, Lio/ktor/utils/io/Y;

    .line 4
    .line 5
    invoke-direct {v2, v1}, Lio/ktor/utils/io/Y;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v3, Lio/ktor/utils/io/Y;

    .line 9
    .line 10
    invoke-direct {v3, v0}, Lio/ktor/utils/io/Y;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v4, Lio/ktor/utils/io/Y;

    .line 14
    .line 15
    const/4 v5, 0x4

    .line 16
    invoke-direct {v4, v5}, Lio/ktor/utils/io/Y;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    new-array v5, v5, [Lio/ktor/utils/io/Y;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    aput-object v2, v5, v6

    .line 24
    .line 25
    aput-object v3, v5, v1

    .line 26
    .line 27
    aput-object v4, v5, v0

    .line 28
    .line 29
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lio/ktor/utils/io/Y;->b:Ljava/util/List;

    .line 34
    .line 35
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/ktor/utils/io/Y;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    const-string p0, "CR"

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    if-ne p0, v0, :cond_1

    .line 9
    .line 10
    const-string p0, "LF"

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    const/4 v0, 0x4

    .line 14
    if-ne p0, v0, :cond_2

    .line 15
    .line 16
    const-string p0, "CRLF"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_2
    sget-object v0, Lio/ktor/utils/io/Y;->b:Ljava/util/List;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    move-object v3, v2

    .line 43
    check-cast v3, Lio/ktor/utils/io/Y;

    .line 44
    .line 45
    iget v3, v3, Lio/ktor/utils/io/Y;->a:I

    .line 46
    .line 47
    or-int/2addr v3, p0

    .line 48
    if-ne v3, p0, :cond_3

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/Y;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lio/ktor/utils/io/Y;

    .line 7
    .line 8
    iget p1, p1, Lio/ktor/utils/io/Y;->a:I

    .line 9
    .line 10
    iget v0, p0, Lio/ktor/utils/io/Y;->a:I

    .line 11
    .line 12
    if-eq v0, p1, :cond_1

    .line 13
    .line 14
    :goto_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lio/ktor/utils/io/Y;->a:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lio/ktor/utils/io/Y;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Lio/ktor/utils/io/Y;->a(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
