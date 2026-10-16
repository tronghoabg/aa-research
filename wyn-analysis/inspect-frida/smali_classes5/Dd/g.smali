.class public final LDd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDd/a;


# static fields
.field public static final b:LDd/g;

.field public static final c:LDd/g;

.field public static final d:LDd/g;

.field public static final e:LDd/g;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LDd/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LDd/g;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LDd/g;->b:LDd/g;

    .line 8
    .line 9
    new-instance v0, LDd/g;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, LDd/g;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LDd/g;->c:LDd/g;

    .line 16
    .line 17
    new-instance v0, LDd/g;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, LDd/g;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LDd/g;->d:LDd/g;

    .line 24
    .line 25
    new-instance v0, LDd/g;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, LDd/g;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, LDd/g;->e:LDd/g;

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LDd/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwd/c;Llf/j;)V
    .locals 4

    .line 1
    iget v0, p0, LDd/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ltf/s;

    .line 7
    .line 8
    const-string v0, "client"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, LCd/a;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x5

    .line 17
    invoke-direct {v0, p2, v1, v2}, LCd/a;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p1, Lwd/c;->f:LGd/b;

    .line 21
    .line 22
    sget-object p2, LGd/b;->l:LD8/a;

    .line 23
    .line 24
    invoke-virtual {p1, p2, v0}, LRd/d;->f(LD8/a;Ltf/q;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast p2, Ltf/p;

    .line 29
    .line 30
    const-string v0, "client"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, LCd/p;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v2, 0x3

    .line 39
    invoke-direct {v0, p2, v1, v2}, LCd/p;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, Lwd/c;->e:LFd/f;

    .line 43
    .line 44
    sget-object p2, LFd/f;->g:LD8/a;

    .line 45
    .line 46
    invoke-virtual {p1, p2, v0}, LRd/d;->f(LD8/a;Ltf/q;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    check-cast p2, Ltf/q;

    .line 51
    .line 52
    const-string v0, "client"

    .line 53
    .line 54
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, LCd/l0;->b:LCd/b;

    .line 58
    .line 59
    sget-object v1, LCd/H;->a:LNd/a;

    .line 60
    .line 61
    iget-object v2, p1, Lwd/c;->i:LNd/d;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, LNd/d;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    sget-object v3, LCd/l0;->c:LNd/a;

    .line 73
    .line 74
    invoke-virtual {v1, v3}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-object v1, v2

    .line 80
    :goto_0
    if-eqz v1, :cond_1

    .line 81
    .line 82
    check-cast v1, LCd/l0;

    .line 83
    .line 84
    new-instance v0, LCd/k0;

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    invoke-direct {v0, p2, p1, v2, v3}, LCd/k0;-><init>(Ljava/lang/Object;Lwd/c;Ljf/c;I)V

    .line 88
    .line 89
    .line 90
    iget-object p1, v1, LCd/l0;->a:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    new-instance p2, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v1, "Plugin "

    .line 101
    .line 102
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, " is not installed. Consider using `install("

    .line 109
    .line 110
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    sget-object v0, LCd/l0;->c:LNd/a;

    .line 114
    .line 115
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v0, ")` in client config first."

    .line 119
    .line 120
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :pswitch_2
    check-cast p2, Ltf/r;

    .line 132
    .line 133
    const-string v0, "client"

    .line 134
    .line 135
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    new-instance v0, LCd/p;

    .line 139
    .line 140
    const/4 v1, 0x0

    .line 141
    const/4 v2, 0x2

    .line 142
    invoke-direct {v0, p2, v1, v2}, LCd/p;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p1, Lwd/c;->e:LFd/f;

    .line 146
    .line 147
    sget-object p2, LFd/f;->h:LD8/a;

    .line 148
    .line 149
    invoke-virtual {p1, p2, v0}, LRd/d;->f(LD8/a;Ltf/q;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
