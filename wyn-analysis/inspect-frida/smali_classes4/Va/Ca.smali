.class public final LVa/Ca;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public synthetic d:LVa/Da;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/Ca;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, LVa/Ca;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/Ca;->d:LVa/Da;

    .line 7
    .line 8
    iget-object v1, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LVa/Ea;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-static {v1, v2}, LVa/Ea;->e(LVa/Ea;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LVa/Ea;

    .line 19
    .line 20
    sget v1, LVa/Ea;->f:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x5d

    .line 23
    .line 24
    rem-int/lit16 v1, v1, 0x80

    .line 25
    .line 26
    sput v1, LVa/Ea;->g:I

    .line 27
    .line 28
    invoke-virtual {v0}, LVa/Ea;->a()Ljava/util/HashSet;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, LVa/za;

    .line 47
    .line 48
    invoke-interface {v1}, LVa/za;->a()V

    .line 49
    .line 50
    .line 51
    sget v1, LVa/Ea;->g:I

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x71

    .line 54
    .line 55
    rem-int/lit16 v1, v1, 0x80

    .line 56
    .line 57
    sput v1, LVa/Ea;->f:I

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-void

    .line 61
    :pswitch_0
    iget-object v0, p0, LVa/Ca;->d:LVa/Da;

    .line 62
    .line 63
    iget-object v1, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, LVa/Ea;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-static {v1, v2}, LVa/Ea;->e(LVa/Ea;Z)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, LVa/Ea;

    .line 74
    .line 75
    invoke-virtual {v0}, LVa/Ea;->b()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_1
    iget-object v0, p0, LVa/Ca;->d:LVa/Da;

    .line 80
    .line 81
    iget-object v1, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, LVa/Ea;

    .line 84
    .line 85
    invoke-virtual {v1}, LVa/Ea;->b()V

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, LVa/Ea;

    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    invoke-static {v0, v1}, LVa/Ea;->e(LVa/Ea;Z)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
