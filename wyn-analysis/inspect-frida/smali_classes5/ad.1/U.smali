.class public final Lad/U;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lad/U;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lad/U;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()LR6/e;
    .locals 2

    .line 1
    new-instance v0, LG6/S;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    iput-object v1, v0, LG6/S;->a:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v1, v0, LG6/S;->b:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v1, p0, Lad/U;->a:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iput-object v1, v0, LG6/S;->a:Ljava/lang/String;

    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Lad/U;->b:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iput-object v1, v0, LG6/S;->b:Ljava/lang/String;

    .line 23
    .line 24
    :cond_1
    new-instance v1, LR6/e;

    .line 25
    .line 26
    invoke-direct {v1, v0}, LR6/e;-><init>(LG6/S;)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lad/U;

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
    check-cast p1, Lad/U;

    .line 12
    .line 13
    iget-object v1, p1, Lad/U;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Lad/U;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object p1, p1, Lad/U;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p0, Lad/U;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lad/U;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lad/U;->b:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v0, v2, v3

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    aput-object v1, v2, v0

    .line 13
    .line 14
    invoke-static {v2}, Lj$/util/Objects;->hash([Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method
