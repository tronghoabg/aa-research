.class public final Lv7/y;
.super Lv7/l;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv7/y;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lv7/C;

.field public final b:Lv7/F;

.field public final c:[B

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/lang/Double;

.field public final f:Ljava/util/ArrayList;

.field public final g:Lv7/m;

.field public final h:Ljava/lang/Integer;

.field public final i:Lv7/L;

.field public final j:Lv7/e;

.field public final k:Lv7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf4/b;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lf4/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lv7/y;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lv7/C;Lv7/F;[BLjava/util/ArrayList;Ljava/lang/Double;Ljava/util/ArrayList;Lv7/m;Ljava/lang/Integer;Lv7/L;Ljava/lang/String;Lv7/f;)V
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
    iput-object p1, p0, Lv7/y;->a:Lv7/C;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lv7/y;->b:Lv7/F;

    .line 13
    .line 14
    invoke-static {p3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, Lv7/y;->c:[B

    .line 18
    .line 19
    invoke-static {p4}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p4, p0, Lv7/y;->d:Ljava/util/ArrayList;

    .line 23
    .line 24
    iput-object p5, p0, Lv7/y;->e:Ljava/lang/Double;

    .line 25
    .line 26
    iput-object p6, p0, Lv7/y;->f:Ljava/util/ArrayList;

    .line 27
    .line 28
    iput-object p7, p0, Lv7/y;->g:Lv7/m;

    .line 29
    .line 30
    iput-object p8, p0, Lv7/y;->h:Ljava/lang/Integer;

    .line 31
    .line 32
    iput-object p9, p0, Lv7/y;->i:Lv7/L;

    .line 33
    .line 34
    if-eqz p10, :cond_0

    .line 35
    .line 36
    :try_start_0
    invoke-static {p10}, Lv7/e;->c(Ljava/lang/String;)Lv7/e;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lv7/y;->j:Lv7/e;
    :try_end_0
    .catch Lv7/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p1

    .line 44
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw p2

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Lv7/y;->j:Lv7/e;

    .line 52
    .line 53
    :goto_0
    iput-object p11, p0, Lv7/y;->k:Lv7/f;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lv7/y;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_0

    .line 6
    .line 7
    :cond_0
    check-cast p1, Lv7/y;

    .line 8
    .line 9
    iget-object v0, p1, Lv7/y;->a:Lv7/C;

    .line 10
    .line 11
    iget-object v1, p0, Lv7/y;->a:Lv7/C;

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    iget-object v0, p0, Lv7/y;->b:Lv7/F;

    .line 20
    .line 21
    iget-object v1, p1, Lv7/y;->b:Lv7/F;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-object v0, p0, Lv7/y;->c:[B

    .line 30
    .line 31
    iget-object v1, p1, Lv7/y;->c:[B

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    iget-object v0, p0, Lv7/y;->e:Ljava/lang/Double;

    .line 40
    .line 41
    iget-object v1, p1, Lv7/y;->e:Ljava/lang/Double;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget-object v0, p0, Lv7/y;->d:Ljava/util/ArrayList;

    .line 50
    .line 51
    iget-object v1, p1, Lv7/y;->d:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-interface {v1, v0}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iget-object v0, p0, Lv7/y;->f:Ljava/util/ArrayList;

    .line 66
    .line 67
    iget-object v1, p1, Lv7/y;->f:Ljava/util/ArrayList;

    .line 68
    .line 69
    if-nez v0, :cond_1

    .line 70
    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    :cond_1
    if-eqz v0, :cond_3

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    invoke-interface {v0, v1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-interface {v1, v0}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    :cond_2
    iget-object v0, p0, Lv7/y;->g:Lv7/m;

    .line 90
    .line 91
    iget-object v1, p1, Lv7/y;->g:Lv7/m;

    .line 92
    .line 93
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    iget-object v0, p0, Lv7/y;->h:Ljava/lang/Integer;

    .line 100
    .line 101
    iget-object v1, p1, Lv7/y;->h:Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    iget-object v0, p0, Lv7/y;->i:Lv7/L;

    .line 110
    .line 111
    iget-object v1, p1, Lv7/y;->i:Lv7/L;

    .line 112
    .line 113
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    iget-object v0, p0, Lv7/y;->j:Lv7/e;

    .line 120
    .line 121
    iget-object v1, p1, Lv7/y;->j:Lv7/e;

    .line 122
    .line 123
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    iget-object v0, p0, Lv7/y;->k:Lv7/f;

    .line 130
    .line 131
    iget-object p1, p1, Lv7/y;->k:Lv7/f;

    .line 132
    .line 133
    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_3

    .line 138
    .line 139
    const/4 p1, 0x1

    .line 140
    return p1

    .line 141
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 142
    return p1
.end method

.method public final hashCode()I
    .locals 13

    .line 1
    iget-object v0, p0, Lv7/y;->c:[B

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
    iget-object v1, p0, Lv7/y;->h:Ljava/lang/Integer;

    .line 12
    .line 13
    iget-object v2, p0, Lv7/y;->i:Lv7/L;

    .line 14
    .line 15
    iget-object v3, p0, Lv7/y;->a:Lv7/C;

    .line 16
    .line 17
    iget-object v4, p0, Lv7/y;->b:Lv7/F;

    .line 18
    .line 19
    iget-object v5, p0, Lv7/y;->d:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v6, p0, Lv7/y;->e:Ljava/lang/Double;

    .line 22
    .line 23
    iget-object v7, p0, Lv7/y;->f:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object v8, p0, Lv7/y;->g:Lv7/m;

    .line 26
    .line 27
    iget-object v9, p0, Lv7/y;->j:Lv7/e;

    .line 28
    .line 29
    iget-object v10, p0, Lv7/y;->k:Lv7/f;

    .line 30
    .line 31
    const/16 v11, 0xb

    .line 32
    .line 33
    new-array v11, v11, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v12, 0x0

    .line 36
    aput-object v3, v11, v12

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    aput-object v4, v11, v3

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    aput-object v0, v11, v3

    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    aput-object v5, v11, v0

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    aput-object v6, v11, v0

    .line 49
    .line 50
    const/4 v0, 0x5

    .line 51
    aput-object v7, v11, v0

    .line 52
    .line 53
    const/4 v0, 0x6

    .line 54
    aput-object v8, v11, v0

    .line 55
    .line 56
    const/4 v0, 0x7

    .line 57
    aput-object v1, v11, v0

    .line 58
    .line 59
    const/16 v0, 0x8

    .line 60
    .line 61
    aput-object v2, v11, v0

    .line 62
    .line 63
    const/16 v0, 0x9

    .line 64
    .line 65
    aput-object v9, v11, v0

    .line 66
    .line 67
    const/16 v0, 0xa

    .line 68
    .line 69
    aput-object v10, v11, v0

    .line 70
    .line 71
    invoke-static {v11}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
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
    iget-object v2, p0, Lv7/y;->a:Lv7/C;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v1, v2, p2, v3}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    iget-object v2, p0, Lv7/y;->b:Lv7/F;

    .line 16
    .line 17
    invoke-static {p1, v1, v2, p2, v3}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    iget-object v2, p0, Lv7/y;->c:[B

    .line 22
    .line 23
    invoke-static {p1, v1, v2, v3}, La/a;->T(Landroid/os/Parcel;I[BZ)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    iget-object v2, p0, Lv7/y;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-static {p1, v1, v2, v3}, La/a;->e0(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x6

    .line 33
    iget-object v2, p0, Lv7/y;->e:Ljava/lang/Double;

    .line 34
    .line 35
    invoke-static {p1, v1, v2}, La/a;->U(Landroid/os/Parcel;ILjava/lang/Double;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x7

    .line 39
    iget-object v2, p0, Lv7/y;->f:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-static {p1, v1, v2, v3}, La/a;->e0(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 42
    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    iget-object v2, p0, Lv7/y;->g:Lv7/m;

    .line 47
    .line 48
    invoke-static {p1, v1, v2, p2, v3}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 49
    .line 50
    .line 51
    const/16 v1, 0x9

    .line 52
    .line 53
    iget-object v2, p0, Lv7/y;->h:Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-static {p1, v1, v2}, La/a;->X(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0xa

    .line 59
    .line 60
    iget-object v2, p0, Lv7/y;->i:Lv7/L;

    .line 61
    .line 62
    invoke-static {p1, v1, v2, p2, v3}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lv7/y;->j:Lv7/e;

    .line 66
    .line 67
    if-nez v1, :cond_0

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget-object v1, v1, Lv7/e;->a:Ljava/lang/String;

    .line 72
    .line 73
    :goto_0
    const/16 v2, 0xb

    .line 74
    .line 75
    invoke-static {p1, v2, v1, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const/16 v1, 0xc

    .line 79
    .line 80
    iget-object v2, p0, Lv7/y;->k:Lv7/f;

    .line 81
    .line 82
    invoke-static {p1, v1, v2, p2, v3}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 83
    .line 84
    .line 85
    invoke-static {v0, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method
