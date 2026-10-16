.class public final LVa/Fa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/za;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public synthetic d:LVa/Ba;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/Fa;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget v0, p0, LVa/Fa;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/Fa;->d:LVa/Ba;

    .line 7
    .line 8
    check-cast v0, LVa/Da;

    .line 9
    .line 10
    iget-object v1, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LVa/z;

    .line 13
    .line 14
    invoke-static {v1}, LVa/z;->e(LVa/z;)LVa/Ea;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p0}, LVa/Ea;->i(LVa/za;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LVa/z;

    .line 24
    .line 25
    sget v1, LVa/z;->h:I

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x19

    .line 28
    .line 29
    rem-int/lit16 v2, v1, 0x80

    .line 30
    .line 31
    sput v2, LVa/z;->g:I

    .line 32
    .line 33
    rem-int/lit8 v1, v1, 0x2

    .line 34
    .line 35
    iget-object v2, p0, LVa/Fa;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, LVa/Ia;

    .line 38
    .line 39
    iget-object v3, p0, LVa/Fa;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, LVa/ha;

    .line 42
    .line 43
    invoke-virtual {v0, v2, v3}, LVa/z;->b(LVa/Ia;LVa/ha;)V

    .line 44
    .line 45
    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const/4 v0, 0x0

    .line 50
    throw v0

    .line 51
    :pswitch_0
    iget-object v0, p0, LVa/Fa;->d:LVa/Ba;

    .line 52
    .line 53
    check-cast v0, LVa/Ga;

    .line 54
    .line 55
    iget-object v1, v0, LVa/Ga;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, LVa/Ha;

    .line 58
    .line 59
    invoke-static {v1}, LVa/Ha;->a(LVa/Ha;)LVa/z;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, LVa/z;->a()LVa/Ea;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, p0}, LVa/Ea;->i(LVa/za;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, LVa/Fa;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, LVa/Pa;

    .line 73
    .line 74
    iget-object v2, p0, LVa/Fa;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, LVa/ya;

    .line 77
    .line 78
    sget v3, LVa/Ha;->h:I

    .line 79
    .line 80
    add-int/lit8 v3, v3, 0x75

    .line 81
    .line 82
    rem-int/lit16 v4, v3, 0x80

    .line 83
    .line 84
    sput v4, LVa/Ha;->g:I

    .line 85
    .line 86
    rem-int/lit8 v3, v3, 0x2

    .line 87
    .line 88
    iget-object v0, v0, LVa/Ga;->h:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, LVa/Ha;

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, LVa/Ha;->b(LVa/Pa;LVa/ya;)V

    .line 93
    .line 94
    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    const/4 v0, 0x0

    .line 99
    throw v0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
