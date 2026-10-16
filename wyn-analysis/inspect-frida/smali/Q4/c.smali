.class public final LQ4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ4/a;


# static fields
.field public static final b:LQ4/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LQ4/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LQ4/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LQ4/c;->b:LQ4/c;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LQ4/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(LE4/B;LB4/g;)LE4/B;
    .locals 4

    .line 1
    iget p2, p0, LQ4/c;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LE4/B;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LP4/c;

    .line 11
    .line 12
    iget-object p1, p1, LP4/c;->a:LP4/b;

    .line 13
    .line 14
    iget-object p1, p1, LP4/b;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, LP4/h;

    .line 17
    .line 18
    iget-object p1, p1, LP4/h;->a:LA4/d;

    .line 19
    .line 20
    iget-object p1, p1, LA4/d;->d:Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, LL4/w;

    .line 27
    .line 28
    sget v0, LY4/c;->a:I

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/nio/Buffer;->isReadOnly()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    new-instance v0, LY4/b;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, v0, LY4/b;->a:[B

    .line 60
    .line 61
    iput v2, v0, LY4/b;->b:I

    .line 62
    .line 63
    iput v3, v0, LY4/b;->c:I

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v0, 0x0

    .line 67
    :goto_0
    if-eqz v0, :cond_1

    .line 68
    .line 69
    iget v1, v0, LY4/b;->b:I

    .line 70
    .line 71
    if-nez v1, :cond_1

    .line 72
    .line 73
    iget-object v1, v0, LY4/b;->a:[B

    .line 74
    .line 75
    array-length v1, v1

    .line 76
    iget v0, v0, LY4/b;->c:I

    .line 77
    .line 78
    if-ne v0, v1, :cond_1

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    new-array v0, v0, [B

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 100
    .line 101
    .line 102
    move-object p1, v0

    .line 103
    :goto_1
    invoke-direct {p2, p1}, LL4/w;-><init>([B)V

    .line 104
    .line 105
    .line 106
    return-object p2

    .line 107
    :pswitch_0
    return-object p1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
