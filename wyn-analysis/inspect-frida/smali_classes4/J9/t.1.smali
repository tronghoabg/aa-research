.class public final synthetic LJ9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJ9/u;

.field public final synthetic c:Lta/f;


# direct methods
.method public synthetic constructor <init>(LJ9/u;Lta/f;I)V
    .locals 0

    .line 1
    iput p3, p0, LJ9/t;->a:I

    iput-object p1, p0, LJ9/t;->b:LJ9/u;

    iput-object p2, p0, LJ9/t;->c:Lta/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, LJ9/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ9/t;->c:Lta/f;

    .line 7
    .line 8
    iget-object v1, p0, LJ9/t;->b:LJ9/u;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, v1, LJ9/u;->b:LHe/g;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, LJ9/t;->b:LJ9/u;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LJ9/t;->c:Lta/f;

    .line 26
    .line 27
    invoke-static {v1}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, v0, LJ9/u;->b:LHe/g;

    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
