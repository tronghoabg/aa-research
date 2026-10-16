.class public final Lc0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lc0/a;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lc0/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lc0/a;

    .line 7
    .line 8
    iget p1, p1, Lc0/a;->a:I

    .line 9
    .line 10
    iget v0, p0, Lc0/a;->a:I

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

    .line 1
    iget v0, p0, Lc0/a;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lc0/a;->a:I

    .line 3
    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    const-string v0, "Next"

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    const/4 v0, 0x2

    .line 10
    if-ne v1, v0, :cond_1

    .line 11
    .line 12
    const-string v0, "Previous"

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    const/4 v0, 0x3

    .line 16
    if-ne v1, v0, :cond_2

    .line 17
    .line 18
    const-string v0, "Left"

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_2
    const/4 v0, 0x4

    .line 22
    if-ne v1, v0, :cond_3

    .line 23
    .line 24
    const-string v0, "Right"

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_3
    const/4 v0, 0x5

    .line 28
    if-ne v1, v0, :cond_4

    .line 29
    .line 30
    const-string v0, "Up"

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_4
    const/4 v0, 0x6

    .line 34
    if-ne v1, v0, :cond_5

    .line 35
    .line 36
    const-string v0, "Down"

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_5
    const/4 v0, 0x7

    .line 40
    if-ne v1, v0, :cond_6

    .line 41
    .line 42
    const-string v0, "In"

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_6
    const/16 v0, 0x8

    .line 46
    .line 47
    if-ne v1, v0, :cond_7

    .line 48
    .line 49
    const-string v0, "Out"

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_7
    const-string v0, "Invalid FocusDirection"

    .line 53
    .line 54
    return-object v0
.end method
