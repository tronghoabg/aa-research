.class public final LHf/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LHf/l;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LHf/l;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LHf/Z;->a:I

    iput-object p1, p0, LHf/Z;->b:LHf/l;

    iput-object p2, p0, LHf/Z;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LHf/Z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LHf/z;

    .line 7
    .line 8
    iget-object v1, p0, LHf/Z;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lea/D;

    .line 11
    .line 12
    const/16 v2, 0xa

    .line 13
    .line 14
    invoke-direct {v0, v2, p1, v1}, LHf/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LHf/Z;->b:LHf/l;

    .line 18
    .line 19
    check-cast p1, LHf/v;

    .line 20
    .line 21
    invoke-virtual {p1, v0, p2}, LHf/v;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 26
    .line 27
    if-ne p1, p2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 31
    .line 32
    :goto_0
    return-object p1

    .line 33
    :pswitch_0
    new-instance v0, LHf/z;

    .line 34
    .line 35
    iget-object v1, p0, LHf/Z;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 38
    .line 39
    const/16 v2, 0x9

    .line 40
    .line 41
    invoke-direct {v0, v2, p1, v1}, LHf/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, LHf/Z;->b:LHf/l;

    .line 45
    .line 46
    check-cast p1, LHf/x0;

    .line 47
    .line 48
    invoke-virtual {p1, v0, p2}, LHf/x0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_1
    new-instance v0, LHf/z;

    .line 55
    .line 56
    iget-object v1, p0, LHf/Z;->c:Ljava/lang/Object;

    .line 57
    .line 58
    const/4 v2, 0x4

    .line 59
    invoke-direct {v0, v2, p1, v1}, LHf/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, LHf/Z;->b:LHf/l;

    .line 63
    .line 64
    invoke-interface {p1, v0, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 69
    .line 70
    if-ne p1, p2, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 74
    .line 75
    :goto_1
    return-object p1

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
