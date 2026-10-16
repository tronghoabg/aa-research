.class public final LH5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[B

.field public b:[B

.field public c:I

.field public d:[I

.field public e:[I

.field public f:I

.field public g:I

.field public h:I

.field public final i:Landroid/media/MediaCodec$CryptoInfo;

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Landroid/media/MediaCodec$CryptoInfo;

    .line 8
    .line 9
    invoke-direct {p1}, Landroid/media/MediaCodec$CryptoInfo;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LH5/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 13
    .line 14
    sget v0, Lu6/v;->a:I

    .line 15
    .line 16
    const/16 v1, 0x18

    .line 17
    .line 18
    if-lt v0, v1, :cond_0

    .line 19
    .line 20
    new-instance v0, LS3/c;

    .line 21
    .line 22
    invoke-direct {v0, p1}, LS3/c;-><init>(Landroid/media/MediaCodec$CryptoInfo;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    iput-object v0, p0, LH5/c;->j:Ljava/lang/Object;

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance p1, Landroid/media/MediaCodec$CryptoInfo;

    .line 34
    .line 35
    invoke-direct {p1}, Landroid/media/MediaCodec$CryptoInfo;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LH5/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 39
    .line 40
    sget v0, LQ1/x;->a:I

    .line 41
    .line 42
    const/16 v1, 0x18

    .line 43
    .line 44
    if-lt v0, v1, :cond_1

    .line 45
    .line 46
    new-instance v0, LS3/e;

    .line 47
    .line 48
    invoke-direct {v0, p1}, LS3/e;-><init>(Landroid/media/MediaCodec$CryptoInfo;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v0, 0x0

    .line 53
    :goto_1
    iput-object v0, p0, LH5/c;->j:Ljava/lang/Object;

    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
