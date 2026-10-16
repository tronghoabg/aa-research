.class public final synthetic LL8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO9/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LL8/h;->a:I

    iput-object p2, p0, LL8/h;->b:Ljava/lang/Object;

    iput-object p3, p0, LL8/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LL8/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LT9/a;

    .line 7
    .line 8
    iget-object v1, p0, LL8/h;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ls8/g;

    .line 11
    .line 12
    invoke-virtual {v1}, Ls8/g;->g()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v1, v1, Ls8/g;->d:LL8/i;

    .line 17
    .line 18
    const-class v3, Ll9/c;

    .line 19
    .line 20
    invoke-virtual {v1, v3}, LL8/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ll9/c;

    .line 25
    .line 26
    iget-object v3, p0, LL8/h;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Landroid/content/Context;

    .line 29
    .line 30
    invoke-direct {v0, v3, v2, v1}, LT9/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ll9/c;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    iget-object v0, p0, LL8/h;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, LL8/i;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, LL8/h;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, LL8/b;

    .line 44
    .line 45
    iget-object v2, v1, LL8/b;->f:LL8/e;

    .line 46
    .line 47
    new-instance v3, LC6/l;

    .line 48
    .line 49
    invoke-direct {v3, v1, v0}, LC6/l;-><init>(LL8/b;LL8/c;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v2, v3}, LL8/e;->o(LC6/l;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
