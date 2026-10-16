.class public Lad/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/ads/AdSize;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/AdSize;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lad/w;->a:Lcom/google/android/gms/ads/AdSize;

    .line 5
    .line 6
    iget v0, p1, Lcom/google/android/gms/ads/AdSize;->a:I

    .line 7
    .line 8
    iput v0, p0, Lad/w;->b:I

    .line 9
    .line 10
    iget p1, p1, Lcom/google/android/gms/ads/AdSize;->b:I

    .line 11
    .line 12
    iput p1, p0, Lad/w;->c:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lad/w;

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
    check-cast p1, Lad/w;

    .line 12
    .line 13
    iget v1, p1, Lad/w;->b:I

    .line 14
    .line 15
    iget v3, p0, Lad/w;->b:I

    .line 16
    .line 17
    if-eq v3, v1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lad/w;->c:I

    .line 21
    .line 22
    iget p1, p1, Lad/w;->c:I

    .line 23
    .line 24
    if-ne v1, p1, :cond_3

    .line 25
    .line 26
    return v0

    .line 27
    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lad/w;->b:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget v1, p0, Lad/w;->c:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    return v0
.end method
