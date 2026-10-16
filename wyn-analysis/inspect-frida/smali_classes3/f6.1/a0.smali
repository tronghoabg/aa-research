.class public final Lf6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/h;


# static fields
.field public static final d:Lf6/a0;


# instance fields
.field public final a:I

.field public final b:Ll8/e0;

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf6/a0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Lf6/Z;

    .line 5
    .line 6
    invoke-direct {v0, v1}, Lf6/a0;-><init>([Lf6/Z;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lf6/a0;->d:Lf6/a0;

    .line 10
    .line 11
    return-void
.end method

.method public varargs constructor <init>([Lf6/Z;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ll8/K;->k([Ljava/lang/Object;)Ll8/e0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lf6/a0;->b:Ll8/e0;

    .line 9
    .line 10
    array-length p1, p1

    .line 11
    iput p1, p0, Lf6/a0;->a:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    :goto_0
    iget-object v0, p0, Lf6/a0;->b:Ll8/e0;

    .line 15
    .line 16
    iget v1, v0, Ll8/e0;->d:I

    .line 17
    .line 18
    if-ge p1, v1, :cond_2

    .line 19
    .line 20
    add-int/lit8 v1, p1, 0x1

    .line 21
    .line 22
    move v2, v1

    .line 23
    :goto_1
    iget v3, v0, Ll8/e0;->d:I

    .line 24
    .line 25
    if-ge v2, v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lf6/Z;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v4}, Lf6/Z;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string v4, "Multiple identical TrackGroups added to one TrackGroupArray."

    .line 46
    .line 47
    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v4, "TrackGroupArray"

    .line 51
    .line 52
    const-string v5, ""

    .line 53
    .line 54
    invoke-static {v4, v5, v3}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move p1, v1

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    return-void
.end method


# virtual methods
.method public final a(I)Lf6/Z;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a0;->b:Ll8/e0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lf6/Z;

    .line 8
    .line 9
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_2

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, Lf6/a0;

    .line 11
    .line 12
    if-eq v1, v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Lf6/a0;

    .line 16
    .line 17
    iget v0, p0, Lf6/a0;->a:I

    .line 18
    .line 19
    iget v1, p1, Lf6/a0;->a:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lf6/a0;->b:Ll8/e0;

    .line 24
    .line 25
    iget-object p1, p1, Lf6/a0;->b:Ll8/e0;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ll8/K;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    :goto_0
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lf6/a0;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf6/a0;->b:Ll8/e0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ll8/K;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lf6/a0;->c:I

    .line 12
    .line 13
    :cond_0
    iget v0, p0, Lf6/a0;->c:I

    .line 14
    .line 15
    return v0
.end method
