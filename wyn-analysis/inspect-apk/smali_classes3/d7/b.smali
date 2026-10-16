.class public final Ld7/b;
.super Lf7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ld7/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Ld7/b;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Landroid/app/PendingIntent;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ld7/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1, v1}, Ld7/b;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ld7/b;->f:Ld7/b;

    .line 9
    .line 10
    new-instance v0, Lc6/a;

    .line 11
    .line 12
    const/16 v1, 0x17

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lc6/a;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ld7/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ld7/b;->a:I

    iput p2, p0, Ld7/b;->b:I

    iput-object p3, p0, Ld7/b;->c:Landroid/app/PendingIntent;

    iput-object p4, p0, Ld7/b;->d:Ljava/lang/String;

    iput-object p5, p0, Ld7/b;->e:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Landroid/app/PendingIntent;)V
    .locals 6

    const/4 v1, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p1

    move-object v4, p2

    move-object v3, p3

    .line 3
    invoke-direct/range {v0 .. v5}, Ld7/b;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public static W(I)Ljava/lang/String;
    .locals 3

    .line 1
    const/16 v0, 0x63

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x5dc

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    packed-switch p0, :pswitch_data_1

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x14

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const-string v0, "UNKNOWN_ERROR_CODE("

    .line 31
    .line 32
    const-string v2, ")"

    .line 33
    .line 34
    invoke-static {v1, v0, p0, v2}, LA7/p0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_0
    const-string p0, "API_INSTALL_REQUIRED"

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_1
    const-string p0, "API_DISABLED_FOR_CONNECTION"

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    const-string p0, "API_DISABLED"

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_3
    const-string p0, "RESOLUTION_ACTIVITY_NOT_FOUND"

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_4
    const-string p0, "API_VERSION_UPDATE_REQUIRED"

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_5
    const-string p0, "RESTRICTED_PROFILE"

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_6
    const-string p0, "SERVICE_MISSING_PERMISSION"

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_7
    const-string p0, "SERVICE_UPDATING"

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_8
    const-string p0, "SIGN_IN_FAILED"

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_9
    const-string p0, "API_UNAVAILABLE"

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_a
    const-string p0, "INTERRUPTED"

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_b
    const-string p0, "TIMEOUT"

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_c
    const-string p0, "CANCELED"

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_d
    const-string p0, "LICENSE_CHECK_FAILED"

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_e
    const-string p0, "DEVELOPER_ERROR"

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_f
    const-string p0, "SERVICE_INVALID"

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_10
    const-string p0, "INTERNAL_ERROR"

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_11
    const-string p0, "NETWORK_ERROR"

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_12
    const-string p0, "RESOLUTION_REQUIRED"

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_13
    const-string p0, "INVALID_ACCOUNT"

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_14
    const-string p0, "SIGN_IN_REQUIRED"

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_15
    const-string p0, "SERVICE_DISABLED"

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_16
    const-string p0, "SERVICE_VERSION_UPDATE_REQUIRED"

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_17
    const-string p0, "SERVICE_MISSING"

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_18
    const-string p0, "SUCCESS"

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_19
    const-string p0, "UNKNOWN"

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_0
    const-string p0, "DRIVE_EXTERNAL_STORAGE_REQUIRED"

    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_1
    const-string p0, "UNFINISHED"

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    :pswitch_data_1
    .packed-switch 0xd
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final V()Z
    .locals 1

    .line 1
    iget v0, p0, Ld7/b;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ld7/b;

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
    check-cast p1, Ld7/b;

    .line 12
    .line 13
    iget v1, p1, Ld7/b;->b:I

    .line 14
    .line 15
    iget v3, p0, Ld7/b;->b:I

    .line 16
    .line 17
    if-ne v3, v1, :cond_2

    .line 18
    .line 19
    iget-object v1, p0, Ld7/b;->c:Landroid/app/PendingIntent;

    .line 20
    .line 21
    iget-object v3, p1, Ld7/b;->c:Landroid/app/PendingIntent;

    .line 22
    .line 23
    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Ld7/b;->d:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p1, Ld7/b;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v1, p0, Ld7/b;->e:Ljava/lang/Integer;

    .line 40
    .line 41
    iget-object p1, p1, Ld7/b;->e:Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    return v0

    .line 50
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Ld7/b;->b:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ld7/b;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Ld7/b;->e:Ljava/lang/Integer;

    .line 10
    .line 11
    iget-object v3, p0, Ld7/b;->c:Landroid/app/PendingIntent;

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
    invoke-static {v4}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, LY2/B;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LY2/B;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Ld7/b;->b:I

    .line 7
    .line 8
    invoke-static {v1}, Ld7/b;->W(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "statusCode"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "resolution"

    .line 18
    .line 19
    iget-object v2, p0, Ld7/b;->c:Landroid/app/PendingIntent;

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "message"

    .line 25
    .line 26
    iget-object v2, p0, Ld7/b;->d:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v1, "clientMethodKey"

    .line 32
    .line 33
    iget-object v2, p0, Ld7/b;->e:Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, LY2/B;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

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
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Ld7/b;->a:I

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 19
    .line 20
    .line 21
    iget v1, p0, Ld7/b;->b:I

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    iget-object v3, p0, Ld7/b;->c:Landroid/app/PendingIntent;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-static {p1, v1, v3, p2, v4}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Ld7/b;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p1, v2, p2, v4}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const/4 p2, 0x5

    .line 39
    iget-object v1, p0, Ld7/b;->e:Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-static {p1, p2, v1}, La/a;->X(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
