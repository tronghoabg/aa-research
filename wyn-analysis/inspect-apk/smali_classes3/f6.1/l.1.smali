.class public final synthetic Lf6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lf6/l;->a:I

    iput-object p2, p0, Lf6/l;->b:Ljava/lang/Object;

    iput-object p3, p0, Lf6/l;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lf6/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lk2/Y;

    .line 7
    .line 8
    iget-object v1, p0, Lf6/l;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LF6/r;

    .line 11
    .line 12
    iget-object v1, v1, LF6/r;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ls2/k;

    .line 15
    .line 16
    iget-object v2, p0, Lf6/l;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, LS3/c;

    .line 19
    .line 20
    invoke-direct {v0, v2, v1}, Lk2/Y;-><init>(LS3/c;Ls2/k;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    new-instance v0, Lf6/P;

    .line 25
    .line 26
    iget-object v1, p0, Lf6/l;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, LC8/i;

    .line 29
    .line 30
    iget-object v1, v1, LC8/i;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, LJ5/i;

    .line 33
    .line 34
    iget-object v2, p0, Lf6/l;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lt6/k;

    .line 37
    .line 38
    invoke-direct {v0, v2, v1}, Lf6/P;-><init>(Lt6/k;LJ5/i;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
