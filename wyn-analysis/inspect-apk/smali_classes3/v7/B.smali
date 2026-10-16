.class public final Lv7/B;
.super Lv7/l;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv7/B;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:[B

.field public final b:Ljava/lang/Double;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/lang/Integer;

.field public final f:Lv7/L;

.field public final g:Lv7/W;

.field public final h:Lv7/f;

.field public final i:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv7/U;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lv7/U;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv7/B;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>([BLjava/lang/Double;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Lv7/L;Ljava/lang/String;Lv7/f;Ljava/lang/Long;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lv7/B;->a:[B

    .line 8
    .line 9
    iput-object p2, p0, Lv7/B;->b:Ljava/lang/Double;

    .line 10
    .line 11
    invoke-static {p3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Lv7/B;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p4, p0, Lv7/B;->d:Ljava/util/ArrayList;

    .line 17
    .line 18
    iput-object p5, p0, Lv7/B;->e:Ljava/lang/Integer;

    .line 19
    .line 20
    iput-object p6, p0, Lv7/B;->f:Lv7/L;

    .line 21
    .line 22
    iput-object p9, p0, Lv7/B;->i:Ljava/lang/Long;

    .line 23
    .line 24
    if-eqz p7, :cond_0

    .line 25
    .line 26
    :try_start_0
    invoke-static {p7}, Lv7/W;->c(Ljava/lang/String;)Lv7/W;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lv7/B;->g:Lv7/W;
    :try_end_0
    .catch Lv7/V; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p1

    .line 34
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    throw p2

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    iput-object p1, p0, Lv7/B;->g:Lv7/W;

    .line 42
    .line 43
    :goto_0
    iput-object p8, p0, Lv7/B;->h:Lv7/f;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lv7/B;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lv7/B;

    .line 7
    .line 8
    iget-object v0, p1, Lv7/B;->a:[B

    .line 9
    .line 10
    iget-object v1, p0, Lv7/B;->a:[B

    .line 11
    .line 12
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lv7/B;->b:Ljava/lang/Double;

    .line 19
    .line 20
    iget-object v1, p1, Lv7/B;->b:Ljava/lang/Double;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lv7/B;->c:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v1, p1, Lv7/B;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, Lv7/B;->d:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v1, p1, Lv7/B;->d:Ljava/util/ArrayList;

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    :cond_1
    if-eqz v0, :cond_3

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-interface {v0, v1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-interface {v1, v0}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    :cond_2
    iget-object v0, p0, Lv7/B;->e:Ljava/lang/Integer;

    .line 63
    .line 64
    iget-object v1, p1, Lv7/B;->e:Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v0, p0, Lv7/B;->f:Lv7/L;

    .line 73
    .line 74
    iget-object v1, p1, Lv7/B;->f:Lv7/L;

    .line 75
    .line 76
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    iget-object v0, p0, Lv7/B;->g:Lv7/W;

    .line 83
    .line 84
    iget-object v1, p1, Lv7/B;->g:Lv7/W;

    .line 85
    .line 86
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    iget-object v0, p0, Lv7/B;->h:Lv7/f;

    .line 93
    .line 94
    iget-object v1, p1, Lv7/B;->h:Lv7/f;

    .line 95
    .line 96
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    iget-object v0, p0, Lv7/B;->i:Ljava/lang/Long;

    .line 103
    .line 104
    iget-object p1, p1, Lv7/B;->i:Ljava/lang/Long;

    .line 105
    .line 106
    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_3

    .line 111
    .line 112
    const/4 p1, 0x1

    .line 113
    return p1

    .line 114
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 115
    return p1
.end method

.method public final hashCode()I
    .locals 11

    .line 1
    iget-object v0, p0, Lv7/B;->a:[B

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lv7/B;->f:Lv7/L;

    .line 12
    .line 13
    iget-object v2, p0, Lv7/B;->g:Lv7/W;

    .line 14
    .line 15
    iget-object v3, p0, Lv7/B;->b:Ljava/lang/Double;

    .line 16
    .line 17
    iget-object v4, p0, Lv7/B;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v5, p0, Lv7/B;->d:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v6, p0, Lv7/B;->e:Ljava/lang/Integer;

    .line 22
    .line 23
    iget-object v7, p0, Lv7/B;->h:Lv7/f;

    .line 24
    .line 25
    iget-object v8, p0, Lv7/B;->i:Ljava/lang/Long;

    .line 26
    .line 27
    const/16 v9, 0x9

    .line 28
    .line 29
    new-array v9, v9, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    aput-object v0, v9, v10

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    aput-object v3, v9, v0

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    aput-object v4, v9, v0

    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    aput-object v5, v9, v0

    .line 42
    .line 43
    const/4 v0, 0x4

    .line 44
    aput-object v6, v9, v0

    .line 45
    .line 46
    const/4 v0, 0x5

    .line 47
    aput-object v1, v9, v0

    .line 48
    .line 49
    const/4 v0, 0x6

    .line 50
    aput-object v2, v9, v0

    .line 51
    .line 52
    const/4 v0, 0x7

    .line 53
    aput-object v7, v9, v0

    .line 54
    .line 55
    const/16 v0, 0x8

    .line 56
    .line 57
    aput-object v8, v9, v0

    .line 58
    .line 59
    invoke-static {v9}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, La/a;->l0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    iget-object v2, p0, Lv7/B;->a:[B

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v1, v2, v3}, La/a;->T(Landroid/os/Parcel;I[BZ)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    iget-object v2, p0, Lv7/B;->b:Ljava/lang/Double;

    .line 16
    .line 17
    invoke-static {p1, v1, v2}, La/a;->U(Landroid/os/Parcel;ILjava/lang/Double;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    iget-object v2, p0, Lv7/B;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1, v1, v2, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    iget-object v2, p0, Lv7/B;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-static {p1, v1, v2, v3}, La/a;->e0(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x6

    .line 33
    iget-object v2, p0, Lv7/B;->e:Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-static {p1, v1, v2}, La/a;->X(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x7

    .line 39
    iget-object v2, p0, Lv7/B;->f:Lv7/L;

    .line 40
    .line 41
    invoke-static {p1, v1, v2, p2, v3}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lv7/B;->g:Lv7/W;

    .line 45
    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v1, v1, Lv7/W;->a:Ljava/lang/String;

    .line 51
    .line 52
    :goto_0
    const/16 v2, 0x8

    .line 53
    .line 54
    invoke-static {p1, v2, v1, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x9

    .line 58
    .line 59
    iget-object v2, p0, Lv7/B;->h:Lv7/f;

    .line 60
    .line 61
    invoke-static {p1, v1, v2, p2, v3}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 62
    .line 63
    .line 64
    const/16 p2, 0xa

    .line 65
    .line 66
    iget-object v1, p0, Lv7/B;->i:Ljava/lang/Long;

    .line 67
    .line 68
    invoke-static {p1, p2, v1}, La/a;->Y(Landroid/os/Parcel;ILjava/lang/Long;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method
