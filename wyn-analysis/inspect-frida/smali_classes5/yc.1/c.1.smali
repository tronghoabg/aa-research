.class public final synthetic Lyc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyc/m;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lyc/g;


# direct methods
.method public synthetic constructor <init>(Lyc/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyc/c;->a:I

    iput-object p1, p0, Lyc/c;->b:Lyc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lyc/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyc/c;->b:Lyc/g;

    .line 7
    .line 8
    iget-object v1, v0, Lyc/g;->z:LPc/q;

    .line 9
    .line 10
    iget-object v0, v0, Lyc/g;->h:Lmd/J;

    .line 11
    .line 12
    const-string v2, "cameraAccess"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2, p1}, Lmd/J;->l(Lyc/C;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lyc/c;->b:Lyc/g;

    .line 19
    .line 20
    iget-object v1, v0, Lyc/g;->z:LPc/q;

    .line 21
    .line 22
    iget-object v0, v0, Lyc/g;->h:Lmd/J;

    .line 23
    .line 24
    const-string v2, "cameraAccess"

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2, p1}, Lmd/J;->l(Lyc/C;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, p0, Lyc/c;->b:Lyc/g;

    .line 31
    .line 32
    iget-object v0, v0, Lyc/g;->h:Lmd/J;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lmd/J;->w(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
