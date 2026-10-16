.class public final LN/G0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lx/r;


# direct methods
.method public synthetic constructor <init>(Lx/r;I)V
    .locals 0

    .line 1
    iput p2, p0, LN/G0;->i:I

    iput-object p1, p0, LN/G0;->j:Lx/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LN/G0;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN/G0;->j:Lx/r;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const-string p1, "(this)"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    return-object p1

    .line 18
    :pswitch_0
    instance-of v0, p1, LX/z;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    move-object v0, p1

    .line 23
    check-cast v0, LX/z;

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    invoke-virtual {v0, v1}, LX/z;->h(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, LN/G0;->j:Lx/r;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lx/r;->a(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    sget-object p1, Lef/C;->a:Lef/C;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
