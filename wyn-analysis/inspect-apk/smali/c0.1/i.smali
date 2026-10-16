.class public final Lc0/i;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lc0/g;


# direct methods
.method public synthetic constructor <init>(Lc0/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc0/i;->i:I

    iput-object p1, p0, Lc0/i;->j:Lc0/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lc0/i;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/i;->j:Lc0/g;

    .line 7
    .line 8
    iget-object v1, v0, Lc0/g;->h:Lc0/n;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lc0/g;->i:Lc0/l;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lc0/n;->e0(Lc0/l;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object v0, Lef/C;->a:Lef/C;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    const-string v0, "<this>"

    .line 21
    .line 22
    iget-object v1, p0, Lc0/i;->j:Lc0/g;

    .line 23
    .line 24
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v1, Lc0/g;->f:Lc0/d;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Lc0/d;->c()V

    .line 32
    .line 33
    .line 34
    :cond_1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
