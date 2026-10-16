.class public final LVa/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# instance fields
.field public final synthetic a:I

.field public synthetic b:LVa/x1;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/b1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LVa/b1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/util/HashMap;

    .line 12
    .line 13
    sget v0, LVa/x1;->T:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x47

    .line 16
    .line 17
    rem-int/lit16 v0, v0, 0x80

    .line 18
    .line 19
    sput v0, LVa/x1;->U:I

    .line 20
    .line 21
    iget-object v0, p0, LVa/b1;->b:LVa/x1;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v1, LVa/v1;

    .line 27
    .line 28
    invoke-direct {v1, v0, p1, p2}, LVa/v1;-><init>(LVa/x1;Ljava/util/HashMap;LVa/Ra;)V

    .line 29
    .line 30
    .line 31
    sget p1, LVa/x1;->U:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x4d

    .line 34
    .line 35
    rem-int/lit16 p1, p1, 0x80

    .line 36
    .line 37
    sput p1, LVa/x1;->T:I

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x3d

    .line 40
    .line 41
    rem-int/lit16 p2, p1, 0x80

    .line 42
    .line 43
    sput p2, LVa/x1;->U:I

    .line 44
    .line 45
    rem-int/lit8 p1, p1, 0x2

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    throw p1

    .line 52
    :pswitch_0
    const/4 v0, 0x0

    .line 53
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 58
    .line 59
    sget v0, LVa/x1;->T:I

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x75

    .line 62
    .line 63
    rem-int/lit16 v0, v0, 0x80

    .line 64
    .line 65
    sput v0, LVa/x1;->U:I

    .line 66
    .line 67
    iget-object v0, p0, LVa/b1;->b:LVa/x1;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v1, LVa/w1;

    .line 73
    .line 74
    invoke-direct {v1, v0, p1, p2}, LVa/w1;-><init>(LVa/x1;Ljava/util/concurrent/ThreadPoolExecutor;LVa/Ra;)V

    .line 75
    .line 76
    .line 77
    sget p1, LVa/x1;->U:I

    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x5f

    .line 80
    .line 81
    rem-int/lit16 p1, p1, 0x80

    .line 82
    .line 83
    sput p1, LVa/x1;->T:I

    .line 84
    .line 85
    add-int/lit8 p1, p1, 0x39

    .line 86
    .line 87
    rem-int/lit16 p2, p1, 0x80

    .line 88
    .line 89
    sput p2, LVa/x1;->U:I

    .line 90
    .line 91
    rem-int/lit8 p1, p1, 0x2

    .line 92
    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_1
    const/4 p1, 0x0

    .line 97
    throw p1

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
