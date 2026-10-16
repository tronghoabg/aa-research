.class public final LF6/e;
.super Lf7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LF6/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Landroid/content/Intent;

.field public final i:LF6/a;

.field public final j:Z

.field public final k:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LD6/B1;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, LD6/B1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LF6/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;LF6/a;)V
    .locals 13

    .line 4
    new-instance v0, Lq7/b;

    invoke-direct {v0, p2}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 5
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v10

    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v9, p1

    .line 6
    invoke-direct/range {v1 .. v12}, LF6/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;ZLandroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LF6/a;)V
    .locals 13

    .line 7
    new-instance v0, Lq7/b;

    move-object/from16 v1, p8

    invoke-direct {v0, v1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 8
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v10

    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    .line 9
    invoke-direct/range {v1 .. v12}, LF6/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;ZLandroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;ZLandroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LF6/e;->a:Ljava/lang/String;

    iput-object p2, p0, LF6/e;->b:Ljava/lang/String;

    iput-object p3, p0, LF6/e;->c:Ljava/lang/String;

    iput-object p4, p0, LF6/e;->d:Ljava/lang/String;

    iput-object p5, p0, LF6/e;->e:Ljava/lang/String;

    iput-object p6, p0, LF6/e;->f:Ljava/lang/String;

    iput-object p7, p0, LF6/e;->g:Ljava/lang/String;

    iput-object p8, p0, LF6/e;->h:Landroid/content/Intent;

    .line 3
    invoke-static {p9}, Lq7/b;->R(Landroid/os/IBinder;)Lq7/a;

    move-result-object p1

    invoke-static {p1}, Lq7/b;->S(Lq7/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF6/a;

    iput-object p1, p0, LF6/e;->i:LF6/a;

    iput-boolean p10, p0, LF6/e;->j:Z

    iput-object p11, p0, LF6/e;->k:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
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
    const/4 v1, 0x2

    .line 8
    iget-object v2, p0, LF6/e;->a:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v1, v2, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    iget-object v2, p0, LF6/e;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p1, v1, v2, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    iget-object v2, p0, LF6/e;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1, v1, v2, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x5

    .line 27
    iget-object v4, p0, LF6/e;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1, v2, v4, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x6

    .line 33
    iget-object v4, p0, LF6/e;->e:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p1, v2, v4, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x7

    .line 39
    iget-object v4, p0, LF6/e;->f:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p1, v2, v4, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const/16 v2, 0x8

    .line 45
    .line 46
    iget-object v4, p0, LF6/e;->g:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p1, v2, v4, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    const/16 v2, 0x9

    .line 52
    .line 53
    iget-object v4, p0, LF6/e;->h:Landroid/content/Intent;

    .line 54
    .line 55
    invoke-static {p1, v2, v4, p2, v3}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Lq7/b;

    .line 59
    .line 60
    iget-object v2, p0, LF6/e;->i:LF6/a;

    .line 61
    .line 62
    invoke-direct {p2, v2}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const/16 v2, 0xa

    .line 70
    .line 71
    invoke-static {p1, v2, p2}, La/a;->V(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 72
    .line 73
    .line 74
    const/16 p2, 0xb

    .line 75
    .line 76
    invoke-static {p1, p2, v1}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 77
    .line 78
    .line 79
    iget-boolean p2, p0, LF6/e;->j:Z

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 82
    .line 83
    .line 84
    const/16 p2, 0xc

    .line 85
    .line 86
    iget-object v1, p0, LF6/e;->k:Landroid/os/Bundle;

    .line 87
    .line 88
    invoke-static {p1, p2, v1, v3}, La/a;->S(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method
