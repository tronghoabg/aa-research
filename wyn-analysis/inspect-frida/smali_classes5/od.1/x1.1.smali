.class public final Lod/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/A1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lod/x1;->a:I

    iput p1, p0, Lod/x1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lod/G1;)V
    .locals 1

    .line 1
    iget v0, p0, Lod/x1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lod/G1;->a:Lod/r;

    .line 7
    .line 8
    iget v0, p0, Lod/x1;->b:I

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lod/X1;->d(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p1, Lod/G1;->a:Lod/r;

    .line 15
    .line 16
    iget v0, p0, Lod/x1;->b:I

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lod/r;->b(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object p1, p1, Lod/G1;->a:Lod/r;

    .line 23
    .line 24
    iget v0, p0, Lod/x1;->b:I

    .line 25
    .line 26
    invoke-interface {p1, v0}, Lod/r;->e(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
