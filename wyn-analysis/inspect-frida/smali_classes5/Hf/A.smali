.class public final LHf/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LHf/v0;


# direct methods
.method public synthetic constructor <init>(LHf/v0;I)V
    .locals 0

    .line 1
    iput p2, p0, LHf/A;->a:I

    iput-object p1, p0, LHf/A;->b:LHf/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LHf/A;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LHf/f;

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, LHf/f;-><init>(LHf/m;I)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LHf/A;->b:LHf/v0;

    .line 14
    .line 15
    invoke-interface {p1, v0, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 20
    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 25
    .line 26
    :goto_0
    return-object p1

    .line 27
    :pswitch_0
    new-instance v0, LHf/f;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {v0, p1, v1}, LHf/f;-><init>(LHf/m;I)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, LHf/A;->b:LHf/v0;

    .line 34
    .line 35
    invoke-interface {p1, v0, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 40
    .line 41
    if-ne p1, p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 45
    .line 46
    :goto_1
    return-object p1

    .line 47
    :pswitch_1
    new-instance v0, Lkotlin/jvm/internal/E;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v1, LHf/z;

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    invoke-direct {v1, v0, p1, v2}, LHf/z;-><init>(Ljava/io/Serializable;Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, LHf/A;->b:LHf/v0;

    .line 59
    .line 60
    invoke-interface {p1, v1, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 65
    .line 66
    if-ne p1, p2, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 70
    .line 71
    :goto_2
    return-object p1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
