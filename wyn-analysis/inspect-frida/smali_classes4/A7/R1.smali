.class public final LA7/R1;
.super Lf7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LA7/R1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/lang/Long;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA6/j;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, LA6/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LA7/R1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;JLjava/lang/Long;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LA7/R1;->a:I

    .line 3
    iput-object p2, p0, LA7/R1;->b:Ljava/lang/String;

    .line 4
    iput-wide p3, p0, LA7/R1;->c:J

    .line 5
    iput-object p5, p0, LA7/R1;->d:Ljava/lang/Long;

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    if-eqz p6, :cond_0

    .line 6
    invoke-virtual {p6}, Ljava/lang/Float;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LA7/R1;->g:Ljava/lang/Double;

    goto :goto_1

    .line 7
    :cond_1
    iput-object p9, p0, LA7/R1;->g:Ljava/lang/Double;

    .line 8
    :goto_1
    iput-object p7, p0, LA7/R1;->e:Ljava/lang/String;

    .line 9
    iput-object p8, p0, LA7/R1;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-static {p4}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 12
    iput v0, p0, LA7/R1;->a:I

    .line 13
    iput-object p4, p0, LA7/R1;->b:Ljava/lang/String;

    .line 14
    iput-wide p1, p0, LA7/R1;->c:J

    .line 15
    iput-object p5, p0, LA7/R1;->f:Ljava/lang/String;

    const/4 p1, 0x0

    if-nez p3, :cond_0

    .line 16
    iput-object p1, p0, LA7/R1;->d:Ljava/lang/Long;

    .line 17
    iput-object p1, p0, LA7/R1;->g:Ljava/lang/Double;

    .line 18
    iput-object p1, p0, LA7/R1;->e:Ljava/lang/String;

    return-void

    .line 19
    :cond_0
    instance-of p2, p3, Ljava/lang/Long;

    if-eqz p2, :cond_1

    .line 20
    check-cast p3, Ljava/lang/Long;

    iput-object p3, p0, LA7/R1;->d:Ljava/lang/Long;

    .line 21
    iput-object p1, p0, LA7/R1;->g:Ljava/lang/Double;

    .line 22
    iput-object p1, p0, LA7/R1;->e:Ljava/lang/String;

    return-void

    .line 23
    :cond_1
    instance-of p2, p3, Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 24
    iput-object p1, p0, LA7/R1;->d:Ljava/lang/Long;

    .line 25
    iput-object p1, p0, LA7/R1;->g:Ljava/lang/Double;

    .line 26
    check-cast p3, Ljava/lang/String;

    iput-object p3, p0, LA7/R1;->e:Ljava/lang/String;

    return-void

    .line 27
    :cond_2
    instance-of p2, p3, Ljava/lang/Double;

    if-eqz p2, :cond_3

    .line 28
    iput-object p1, p0, LA7/R1;->d:Ljava/lang/Long;

    .line 29
    check-cast p3, Ljava/lang/Double;

    iput-object p3, p0, LA7/R1;->g:Ljava/lang/Double;

    .line 30
    iput-object p1, p0, LA7/R1;->e:Ljava/lang/String;

    return-void

    .line 31
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "User attribute given of un-supported type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(LA7/T1;)V
    .locals 6

    .line 32
    iget-object v4, p1, LA7/T1;->c:Ljava/lang/String;

    iget-object v3, p1, LA7/T1;->e:Ljava/lang/Object;

    iget-object v5, p1, LA7/T1;->b:Ljava/lang/String;

    iget-wide v1, p1, LA7/T1;->d:J

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LA7/R1;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

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
    const/4 v1, 0x4

    .line 9
    invoke-static {p1, v0, v1}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, LA7/R1;->a:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    iget-object v2, p0, LA7/R1;->b:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {p1, v0, v2, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    const/16 v2, 0x8

    .line 26
    .line 27
    invoke-static {p1, v0, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 28
    .line 29
    .line 30
    iget-wide v4, p0, LA7/R1;->c:J

    .line 31
    .line 32
    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LA7/R1;->d:Ljava/lang/Long;

    .line 36
    .line 37
    invoke-static {p1, v1, v0}, La/a;->Y(Landroid/os/Parcel;ILjava/lang/Long;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x6

    .line 41
    iget-object v1, p0, LA7/R1;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1, v0, v1, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x7

    .line 47
    iget-object v1, p0, LA7/R1;->f:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p1, v0, v1, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, LA7/R1;->g:Ljava/lang/Double;

    .line 53
    .line 54
    invoke-static {p1, v2, v0}, La/a;->U(Landroid/os/Parcel;ILjava/lang/Double;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p2, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final zza()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/R1;->d:Ljava/lang/Long;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, LA7/R1;->g:Ljava/lang/Double;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_1
    iget-object v0, p0, LA7/R1;->e:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_2
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method
