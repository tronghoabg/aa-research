.class public final LY3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LHf/x0;


# direct methods
.method public synthetic constructor <init>(LHf/x0;I)V
    .locals 0

    .line 1
    iput p2, p0, LY3/l;->a:I

    iput-object p1, p0, LY3/l;->b:LHf/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LY3/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LHf/f;

    .line 7
    .line 8
    const/16 v1, 0x9

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, LHf/f;-><init>(LHf/m;I)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LY3/l;->b:LHf/x0;

    .line 14
    .line 15
    invoke-virtual {p1, v0, p2}, LHf/x0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_0
    new-instance v0, LHf/f;

    .line 22
    .line 23
    const/4 v1, 0x7

    .line 24
    invoke-direct {v0, p1, v1}, LHf/f;-><init>(LHf/m;I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LY3/l;->b:LHf/x0;

    .line 28
    .line 29
    invoke-virtual {p1, v0, p2}, LHf/x0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_1
    new-instance v0, LHf/f;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {v0, p1, v1}, LHf/f;-><init>(LHf/m;I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, LY3/l;->b:LHf/x0;

    .line 42
    .line 43
    invoke-virtual {p1, v0, p2}, LHf/x0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_2
    new-instance v0, LHf/f;

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-direct {v0, p1, v1}, LHf/f;-><init>(LHf/m;I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LY3/l;->b:LHf/x0;

    .line 56
    .line 57
    invoke-virtual {p1, v0, p2}, LHf/x0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
