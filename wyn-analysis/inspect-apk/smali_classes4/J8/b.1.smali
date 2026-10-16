.class public final LJ8/b;
.super Lf7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LJ8/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public h:Ljava/lang/String;

.field public i:I

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LI2/d;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, LI2/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LJ8/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LG6/m;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, LG6/m;->a:Ljava/lang/String;

    .line 3
    iput-object v0, p0, LJ8/b;->a:Ljava/lang/String;

    .line 4
    iget-object v0, p1, LG6/m;->b:Ljava/lang/String;

    .line 5
    iput-object v0, p0, LJ8/b;->b:Ljava/lang/String;

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, LJ8/b;->c:Ljava/lang/String;

    .line 7
    iget-object v1, p1, LG6/m;->c:Ljava/lang/String;

    .line 8
    iput-object v1, p0, LJ8/b;->d:Ljava/lang/String;

    .line 9
    iget-boolean v1, p1, LG6/m;->d:Z

    .line 10
    iput-boolean v1, p0, LJ8/b;->e:Z

    .line 11
    iget-object v1, p1, LG6/m;->f:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 12
    iput-object v1, p0, LJ8/b;->f:Ljava/lang/String;

    .line 13
    iget-boolean v1, p1, LG6/m;->e:Z

    .line 14
    iput-boolean v1, p0, LJ8/b;->g:Z

    .line 15
    iget-object p1, p1, LG6/m;->g:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 16
    iput-object p1, p0, LJ8/b;->j:Ljava/lang/String;

    .line 17
    iput-object v0, p0, LJ8/b;->k:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, LJ8/b;->a:Ljava/lang/String;

    .line 20
    iput-object p2, p0, LJ8/b;->b:Ljava/lang/String;

    .line 21
    iput-object p3, p0, LJ8/b;->c:Ljava/lang/String;

    .line 22
    iput-object p4, p0, LJ8/b;->d:Ljava/lang/String;

    .line 23
    iput-boolean p5, p0, LJ8/b;->e:Z

    .line 24
    iput-object p6, p0, LJ8/b;->f:Ljava/lang/String;

    .line 25
    iput-boolean p7, p0, LJ8/b;->g:Z

    .line 26
    iput-object p8, p0, LJ8/b;->h:Ljava/lang/String;

    .line 27
    iput p9, p0, LJ8/b;->i:I

    .line 28
    iput-object p10, p0, LJ8/b;->j:Ljava/lang/String;

    .line 29
    iput-object p11, p0, LJ8/b;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p2, p1}, La/a;->l0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x1

    .line 8
    iget-object v1, p0, LJ8/b;->a:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {p1, v0, v1, v2}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    iget-object v1, p0, LJ8/b;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p1, v0, v1, v2}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    iget-object v1, p0, LJ8/b;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1, v0, v1, v2}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    iget-object v1, p0, LJ8/b;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1, v0, v1, v2}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x5

    .line 33
    invoke-static {p1, v1, v0}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 34
    .line 35
    .line 36
    iget-boolean v1, p0, LJ8/b;->e:Z

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x6

    .line 42
    iget-object v3, p0, LJ8/b;->f:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p1, v1, v3, v2}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x7

    .line 48
    invoke-static {p1, v1, v0}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 49
    .line 50
    .line 51
    iget-boolean v1, p0, LJ8/b;->g:Z

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x8

    .line 57
    .line 58
    iget-object v3, p0, LJ8/b;->h:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p1, v1, v3, v2}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    iget v1, p0, LJ8/b;->i:I

    .line 64
    .line 65
    const/16 v3, 0x9

    .line 66
    .line 67
    invoke-static {p1, v3, v0}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    .line 72
    .line 73
    const/16 v0, 0xa

    .line 74
    .line 75
    iget-object v1, p0, LJ8/b;->j:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {p1, v0, v1, v2}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 78
    .line 79
    .line 80
    const/16 v0, 0xb

    .line 81
    .line 82
    iget-object v1, p0, LJ8/b;->k:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {p1, v0, v1, v2}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    invoke-static {p2, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method
