.class public final LL4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB4/i;


# instance fields
.field public final synthetic a:I

.field public final b:LL4/m;


# direct methods
.method public synthetic constructor <init>(LL4/m;I)V
    .locals 0

    .line 1
    iput p2, p0, LL4/d;->a:I

    iput-object p1, p0, LL4/d;->b:LL4/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILB4/g;)LE4/B;
    .locals 6

    .line 1
    iget v0, p0, LL4/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    new-instance v1, Lb7/k;

    .line 9
    .line 10
    iget-object v0, p0, LL4/d;->b:LL4/m;

    .line 11
    .line 12
    iget-object v2, v0, LL4/m;->d:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v3, v0, LL4/m;->c:LF4/f;

    .line 15
    .line 16
    invoke-direct {v1, p1, v2, v3}, Lb7/k;-><init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;LF4/f;)V

    .line 17
    .line 18
    .line 19
    sget-object v5, LL4/m;->k:Lc8/e;

    .line 20
    .line 21
    move v2, p2

    .line 22
    move v3, p3

    .line 23
    move-object v4, p4

    .line 24
    invoke-virtual/range {v0 .. v5}, LL4/m;->a(LL4/s;IILB4/g;LL4/l;)LL4/c;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_0
    move v2, p2

    .line 30
    move v3, p3

    .line 31
    move-object v4, p4

    .line 32
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    sget p2, LY4/c;->a:I

    .line 35
    .line 36
    new-instance p2, LY4/a;

    .line 37
    .line 38
    invoke-direct {p2, p1}, LY4/a;-><init>(Ljava/nio/ByteBuffer;)V

    .line 39
    .line 40
    .line 41
    sget-object v5, LL4/m;->k:Lc8/e;

    .line 42
    .line 43
    iget-object v0, p0, LL4/d;->b:LL4/m;

    .line 44
    .line 45
    new-instance v1, LG9/e;

    .line 46
    .line 47
    iget-object p1, v0, LL4/m;->d:Ljava/util/ArrayList;

    .line 48
    .line 49
    iget-object p3, v0, LL4/m;->c:LF4/f;

    .line 50
    .line 51
    invoke-direct {v1, p3, p2, p1}, LG9/e;-><init>(LF4/f;Ljava/io/InputStream;Ljava/util/ArrayList;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual/range {v0 .. v5}, LL4/m;->a(LL4/s;IILB4/g;LL4/l;)LL4/c;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;LB4/g;)Z
    .locals 0

    .line 1
    iget p2, p0, LL4/d;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    iget-object p1, p0, LL4/d;->b:LL4/m;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    iget-object p1, p0, LL4/d;->b:LL4/m;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
