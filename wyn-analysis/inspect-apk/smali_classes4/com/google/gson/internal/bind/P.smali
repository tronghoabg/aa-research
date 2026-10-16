.class public final Lcom/google/gson/internal/bind/P;
.super Lla/z;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/gson/internal/bind/TypeAdapters$32;Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/gson/internal/bind/P;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/gson/internal/bind/P;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/gson/internal/bind/P;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lla/l;Ljava/lang/reflect/Type;Lla/z;Lna/m;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/gson/internal/bind/P;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lcom/dexterous/flutterlocalnotifications/j;

    invoke-direct {v0, p1, p3, p2}, Lcom/dexterous/flutterlocalnotifications/j;-><init>(Lla/l;Lla/z;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lcom/google/gson/internal/bind/P;->b:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, Lcom/google/gson/internal/bind/P;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lra/a;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/gson/internal/bind/P;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lra/a;->e0()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lra/a;->a0()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/P;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lna/m;

    .line 22
    .line 23
    invoke-interface {v0}, Lna/m;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/Collection;

    .line 28
    .line 29
    invoke-virtual {p1}, Lra/a;->a()V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {p1}, Lra/a;->D()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lcom/google/gson/internal/bind/P;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lcom/dexterous/flutterlocalnotifications/j;

    .line 41
    .line 42
    iget-object v1, v1, Lcom/dexterous/flutterlocalnotifications/j;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lla/z;

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Lla/z;->b(Lra/a;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p1}, Lra/a;->i()V

    .line 55
    .line 56
    .line 57
    move-object p1, v0

    .line 58
    :goto_1
    return-object p1

    .line 59
    :pswitch_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/P;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lcom/google/gson/internal/bind/TypeAdapters$32;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/google/gson/internal/bind/TypeAdapters$32;->b:Lla/z;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Lla/z;->b(Lra/a;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-object v1, p0, Lcom/google/gson/internal/bind/P;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ljava/lang/Class;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_2

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    new-instance v2, Lla/p;

    .line 83
    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v4, "Expected a "

    .line 87
    .line 88
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v1, " but was "

    .line 99
    .line 100
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v0, "; at path "

    .line 115
    .line 116
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Lra/a;->B()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    const/16 v0, 0xd

    .line 131
    .line 132
    invoke-direct {v2, p1, v0}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    throw v2

    .line 136
    :cond_3
    :goto_2
    return-object v0

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lra/b;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/gson/internal/bind/P;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/util/Collection;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lra/b;->z()Lra/b;

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p1}, Lra/b;->b()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/google/gson/internal/bind/P;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lcom/dexterous/flutterlocalnotifications/j;

    .line 34
    .line 35
    invoke-virtual {v1, p1, v0}, Lcom/dexterous/flutterlocalnotifications/j;->c(Lra/b;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p1}, Lra/b;->i()V

    .line 40
    .line 41
    .line 42
    :goto_1
    return-void

    .line 43
    :pswitch_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/P;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lcom/google/gson/internal/bind/TypeAdapters$32;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/google/gson/internal/bind/TypeAdapters$32;->b:Lla/z;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p2}, Lla/z;->c(Lra/b;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
