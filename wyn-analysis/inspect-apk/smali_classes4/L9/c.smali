.class public final LL9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final synthetic a:I

.field public final b:LS3/c;


# direct methods
.method public synthetic constructor <init>(LS3/c;I)V
    .locals 0

    .line 1
    iput p2, p0, LL9/c;->a:I

    iput-object p1, p0, LL9/c;->b:LS3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LL9/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LL9/c;->b:LS3/c;

    .line 7
    .line 8
    iget-object v0, v0, LS3/c;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ll9/d;

    .line 11
    .line 12
    invoke-static {v0}, LFe/b;->l(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, LL9/c;->b:LS3/c;

    .line 17
    .line 18
    iget-object v0, v0, LS3/c;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LJ9/L;

    .line 21
    .line 22
    invoke-static {v0}, LFe/b;->l(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
