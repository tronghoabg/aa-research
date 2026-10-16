.class public final Ll7/a;
.super Lf7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Ll7/e;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Z

.field public final d:I

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:Ljava/lang/Class;

.field public final i:Ljava/lang/String;

.field public j:Ll7/h;

.field public final k:Lk7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll7/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll7/a;->CREATOR:Ll7/e;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(IIZIZLjava/lang/String;ILjava/lang/String;Lk7/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ll7/a;->a:I

    iput p2, p0, Ll7/a;->b:I

    iput-boolean p3, p0, Ll7/a;->c:Z

    iput p4, p0, Ll7/a;->d:I

    iput-boolean p5, p0, Ll7/a;->e:Z

    iput-object p6, p0, Ll7/a;->f:Ljava/lang/String;

    iput p7, p0, Ll7/a;->g:I

    const/4 p1, 0x0

    if-nez p8, :cond_0

    iput-object p1, p0, Ll7/a;->h:Ljava/lang/Class;

    iput-object p1, p0, Ll7/a;->i:Ljava/lang/String;

    goto :goto_0

    .line 3
    :cond_0
    const-class p2, Ll7/d;

    iput-object p2, p0, Ll7/a;->h:Ljava/lang/Class;

    iput-object p8, p0, Ll7/a;->i:Ljava/lang/String;

    :goto_0
    if-nez p9, :cond_1

    .line 4
    iput-object p1, p0, Ll7/a;->k:Lk7/a;

    return-void

    .line 5
    :cond_1
    iget-object p1, p9, Lk7/b;->b:Lk7/a;

    if-eqz p1, :cond_2

    .line 6
    iput-object p1, p0, Ll7/a;->k:Lk7/a;

    return-void

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "There was no converter wrapped in this ConverterWrapper."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(IZIZLjava/lang/String;ILjava/lang/Class;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 9
    iput v0, p0, Ll7/a;->a:I

    iput p1, p0, Ll7/a;->b:I

    iput-boolean p2, p0, Ll7/a;->c:Z

    iput p3, p0, Ll7/a;->d:I

    iput-boolean p4, p0, Ll7/a;->e:Z

    iput-object p5, p0, Ll7/a;->f:Ljava/lang/String;

    iput p6, p0, Ll7/a;->g:I

    iput-object p7, p0, Ll7/a;->h:Ljava/lang/Class;

    const/4 p1, 0x0

    if-nez p7, :cond_0

    iput-object p1, p0, Ll7/a;->i:Ljava/lang/String;

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll7/a;->i:Ljava/lang/String;

    .line 11
    :goto_0
    iput-object p1, p0, Ll7/a;->k:Lk7/a;

    return-void
.end method

.method public static V(ILjava/lang/String;)Ll7/a;
    .locals 8

    .line 1
    new-instance v0, Ll7/a;

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v4, 0x1

    .line 5
    const/4 v1, 0x7

    .line 6
    const/4 v7, 0x0

    .line 7
    move v3, v1

    .line 8
    move v6, p0

    .line 9
    move-object v5, p1

    .line 10
    invoke-direct/range {v0 .. v7}, Ll7/a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
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
    iget v1, p0, Ll7/a;->a:I

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "versionCode"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Ll7/a;->b:I

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "typeIn"

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, Ll7/a;->c:Z

    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "typeInArray"

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Ll7/a;->d:I

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "typeOut"

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-boolean v1, p0, Ll7/a;->e:Z

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "typeOutArray"

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v1, "outputFieldName"

    .line 62
    .line 63
    iget-object v2, p0, Ll7/a;->f:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, v2, v1}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget v1, p0, Ll7/a;->g:I

    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v2, "safeParcelFieldId"

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Ll7/a;->i:Ljava/lang/String;

    .line 80
    .line 81
    if-nez v1, :cond_0

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    :cond_0
    const-string v2, "concreteTypeName"

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Ll7/a;->h:Ljava/lang/Class;

    .line 90
    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    const-string v2, "concreteType.class"

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v0, v1, v2}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    iget-object v1, p0, Ll7/a;->k:Lk7/a;

    .line 103
    .line 104
    if-eqz v1, :cond_2

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const-string v2, "converterName"

    .line 115
    .line 116
    invoke-virtual {v0, v1, v2}, LY2/B;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_2
    invoke-virtual {v0}, LY2/B;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
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
    iget v1, p0, Ll7/a;->a:I

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
    iget v1, p0, Ll7/a;->b:I

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 28
    .line 29
    .line 30
    iget-boolean v1, p0, Ll7/a;->c:Z

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v2, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 36
    .line 37
    .line 38
    iget v1, p0, Ll7/a;->d:I

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 45
    .line 46
    .line 47
    iget-boolean v1, p0, Ll7/a;->e:Z

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x6

    .line 53
    iget-object v3, p0, Ll7/a;->f:Ljava/lang/String;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-static {p1, v1, v3, v4}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x7

    .line 60
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 61
    .line 62
    .line 63
    iget v1, p0, Ll7/a;->g:I

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    iget-object v2, p0, Ll7/a;->i:Ljava/lang/String;

    .line 70
    .line 71
    if-nez v2, :cond_0

    .line 72
    .line 73
    move-object v2, v1

    .line 74
    :cond_0
    const/16 v3, 0x8

    .line 75
    .line 76
    invoke-static {p1, v3, v2, v4}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, Ll7/a;->k:Lk7/a;

    .line 80
    .line 81
    if-nez v2, :cond_1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    instance-of v1, v2, Lk7/a;

    .line 85
    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    new-instance v1, Lk7/b;

    .line 89
    .line 90
    invoke-direct {v1, v2}, Lk7/b;-><init>(Lk7/a;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    const/16 v2, 0x9

    .line 94
    .line 95
    invoke-static {p1, v2, v1, p2, v4}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    const-string p2, "Unsupported safe parcelable field converter class."

    .line 105
    .line 106
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1
.end method
