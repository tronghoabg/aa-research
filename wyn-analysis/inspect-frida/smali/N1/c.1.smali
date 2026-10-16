.class public final LN1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:LN1/c;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public d:Ly3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LN1/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v1, v2}, LN1/c;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LN1/c;->e:LN1/c;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    const/4 v3, 0x3

    .line 12
    const/4 v4, 0x4

    .line 13
    invoke-static {v1, v2, v0, v3, v4}, LN0/a;->k(IIIII)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LN1/c;->a:I

    .line 5
    .line 6
    iput p2, p0, LN1/c;->b:I

    .line 7
    .line 8
    iput p3, p0, LN1/c;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ly3/j;
    .locals 1

    .line 1
    iget-object v0, p0, LN1/c;->d:Ly3/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ly3/j;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ly3/j;-><init>(LN1/c;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LN1/c;->d:Ly3/j;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LN1/c;->d:Ly3/j;

    .line 13
    .line 14
    return-object v0
.end method

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
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-class v2, LN1/c;

    .line 12
    .line 13
    if-eq v2, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, LN1/c;

    .line 17
    .line 18
    iget v1, p0, LN1/c;->a:I

    .line 19
    .line 20
    iget v2, p1, LN1/c;->a:I

    .line 21
    .line 22
    if-ne v1, v2, :cond_2

    .line 23
    .line 24
    iget v1, p0, LN1/c;->b:I

    .line 25
    .line 26
    iget v2, p1, LN1/c;->b:I

    .line 27
    .line 28
    if-ne v1, v2, :cond_2

    .line 29
    .line 30
    iget v1, p0, LN1/c;->c:I

    .line 31
    .line 32
    iget p1, p1, LN1/c;->c:I

    .line 33
    .line 34
    if-ne v1, p1, :cond_2

    .line 35
    .line 36
    return v0

    .line 37
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const/16 v0, 0x20f

    .line 2
    .line 3
    iget v1, p0, LN1/c;->a:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget v1, p0, LN1/c;->b:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget v1, p0, LN1/c;->c:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    return v0
.end method
