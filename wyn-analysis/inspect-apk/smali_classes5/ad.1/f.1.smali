.class public final Lad/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lad/h;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lad/h;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput p1, p0, Lad/f;->a:I

    .line 10
    iput-object p2, p0, Lad/f;->b:Ljava/lang/String;

    .line 11
    iput-object p3, p0, Lad/f;->c:Ljava/lang/String;

    .line 12
    iput-object p4, p0, Lad/f;->d:Lad/h;

    return-void
.end method

.method public constructor <init>(Lx6/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget v0, p1, Lx6/a;->a:I

    .line 3
    iput v0, p0, Lad/f;->a:I

    .line 4
    iget-object v0, p1, Lx6/a;->c:Ljava/lang/String;

    iput-object v0, p0, Lad/f;->b:Ljava/lang/String;

    .line 5
    iget-object v0, p1, Lx6/a;->b:Ljava/lang/String;

    iput-object v0, p0, Lad/f;->c:Ljava/lang/String;

    .line 6
    iget-object p1, p1, Lx6/l;->e:Lx6/t;

    if-eqz p1, :cond_0

    .line 7
    new-instance v0, Lad/h;

    invoke-direct {v0, p1}, Lad/h;-><init>(Lx6/t;)V

    iput-object v0, p0, Lad/f;->d:Lad/h;

    :cond_0
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lad/f;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v1

    .line 11
    :cond_1
    check-cast p1, Lad/f;

    .line 12
    .line 13
    iget v0, p1, Lad/f;->a:I

    .line 14
    .line 15
    iget v2, p0, Lad/f;->a:I

    .line 16
    .line 17
    if-eq v2, v0, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v0, p0, Lad/f;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v2, p1, Lad/f;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    return v1

    .line 31
    :cond_3
    iget-object v0, p0, Lad/f;->d:Lad/h;

    .line 32
    .line 33
    iget-object v2, p1, Lad/f;->d:Lad/h;

    .line 34
    .line 35
    invoke-static {v0, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    return v1

    .line 42
    :cond_4
    iget-object v0, p0, Lad/f;->c:Ljava/lang/String;

    .line 43
    .line 44
    iget-object p1, p1, Lad/f;->c:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Lad/f;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lad/f;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lad/f;->d:Lad/h;

    .line 10
    .line 11
    iget-object v3, p0, Lad/f;->b:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v4, 0x4

    .line 14
    new-array v4, v4, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v0, v4, v5

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    aput-object v3, v4, v0

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    aput-object v1, v4, v0

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    aput-object v2, v4, v0

    .line 27
    .line 28
    invoke-static {v4}, Lj$/util/Objects;->hash([Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
.end method
