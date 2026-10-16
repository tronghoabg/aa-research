.class public final synthetic Lzd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lzd/e;


# direct methods
.method public synthetic constructor <init>(Lzd/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzd/d;->a:I

    iput-object p1, p0, Lzd/d;->b:Lzd/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lzd/d;->b:Lzd/e;

    .line 2
    .line 3
    iget v1, p0, Lzd/d;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, LEf/I0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2}, LEf/o0;-><init>(LEf/m0;)V

    .line 12
    .line 13
    .line 14
    sget-object v2, LEf/B;->a:LEf/B;

    .line 15
    .line 16
    new-instance v3, LE0/h;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-direct {v3, v2, v4}, LE0/h;-><init>(Ljf/g;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v3}, LFe/c;->B(Ljf/h;Ljf/h;)Ljf/h;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v0, v0, Lzd/e;->a:Lef/p;

    .line 27
    .line 28
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, LEf/A;

    .line 33
    .line 34
    invoke-interface {v1, v0}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, LEf/D;

    .line 39
    .line 40
    const-string v2, "ktor-android-context"

    .line 41
    .line 42
    invoke-direct {v1, v2}, LEf/D;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :pswitch_0
    check-cast v0, LAd/e;

    .line 51
    .line 52
    iget-object v0, v0, LAd/e;->d:LAd/h;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object v0, LEf/S;->a:LLf/e;

    .line 58
    .line 59
    sget-object v0, LLf/d;->b:LLf/d;

    .line 60
    .line 61
    return-object v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
