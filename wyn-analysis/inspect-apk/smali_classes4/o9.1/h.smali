.class public final Lo9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/c;


# instance fields
.field public final a:Ls9/h;

.field public final b:Ls9/o;

.field public final c:Z

.field public final d:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ls9/h;Ls9/o;ZLjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo9/h;->a:Ls9/h;

    .line 5
    .line 6
    iput-object p2, p0, Lo9/h;->b:Ls9/o;

    .line 7
    .line 8
    iput-boolean p3, p0, Lo9/h;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, Lo9/h;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lo9/h;

    .line 12
    .line 13
    if-eq v1, v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lo9/h;

    .line 17
    .line 18
    iget-boolean v0, p0, Lo9/h;->c:Z

    .line 19
    .line 20
    iget-boolean v1, p1, Lo9/h;->c:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-object v0, p0, Lo9/h;->a:Ls9/h;

    .line 26
    .line 27
    iget-object v1, p1, Lo9/h;->a:Ls9/h;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ls9/h;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-object v0, p0, Lo9/h;->b:Ls9/o;

    .line 37
    .line 38
    iget-object v1, p1, Lo9/h;->b:Ls9/o;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v0, p0, Lo9/h;->d:Ljava/util/ArrayList;

    .line 48
    .line 49
    iget-object p1, p1, Lo9/h;->d:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1

    .line 56
    :cond_5
    :goto_0
    const/4 p1, 0x0

    .line 57
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lo9/h;->a:Ls9/h;

    .line 2
    .line 3
    iget-object v0, v0, Ls9/h;->a:Ls9/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Ls9/e;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lo9/h;->b:Ls9/o;

    .line 12
    .line 13
    iget-object v1, v1, Ls9/o;->a:Ls8/q;

    .line 14
    .line 15
    invoke-virtual {v1}, Ls8/q;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    mul-int/lit8 v1, v1, 0x1f

    .line 21
    .line 22
    iget-boolean v0, p0, Lo9/h;->c:Z

    .line 23
    .line 24
    add-int/2addr v1, v0

    .line 25
    mul-int/lit8 v1, v1, 0x1f

    .line 26
    .line 27
    iget-object v0, p0, Lo9/h;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    add-int/2addr v0, v1

    .line 34
    return v0
.end method
