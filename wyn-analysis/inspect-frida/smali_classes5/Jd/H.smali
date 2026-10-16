.class public final LJd/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime LSf/e;
    with = LJd/I;
.end annotation


# static fields
.field public static final Companion:LJd/G;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:LJd/D;

.field public final h:LJd/D;

.field public final i:Lef/p;

.field public final j:Lef/p;

.field public final k:Lef/p;

.field public final l:Lef/p;

.field public final m:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJd/G;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJd/H;->Companion:LJd/G;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LJd/D;Ljava/lang/String;ILjava/util/ArrayList;LJd/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parameters"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p5, "fragment"

    .line 12
    .line 13
    invoke-static {p6, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, LJd/H;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput p3, p0, LJd/H;->b:I

    .line 22
    .line 23
    iput-object p7, p0, LJd/H;->c:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p8, p0, LJd/H;->d:Ljava/lang/String;

    .line 26
    .line 27
    iput-boolean p9, p0, LJd/H;->e:Z

    .line 28
    .line 29
    iput-object p10, p0, LJd/H;->f:Ljava/lang/String;

    .line 30
    .line 31
    if-ltz p3, :cond_1

    .line 32
    .line 33
    const/high16 p2, 0x10000

    .line 34
    .line 35
    if-ge p3, p2, :cond_1

    .line 36
    .line 37
    new-instance p2, LJd/E;

    .line 38
    .line 39
    const/4 p3, 0x0

    .line 40
    invoke-direct {p2, p4, p3}, LJd/E;-><init>(Ljava/util/ArrayList;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p2}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, LJd/H;->g:LJd/D;

    .line 47
    .line 48
    if-nez p1, :cond_0

    .line 49
    .line 50
    sget-object p1, LJd/D;->c:LJd/D;

    .line 51
    .line 52
    :cond_0
    iput-object p1, p0, LJd/H;->h:LJd/D;

    .line 53
    .line 54
    new-instance p1, LBf/g;

    .line 55
    .line 56
    const/4 p2, 0x1

    .line 57
    invoke-direct {p1, p2, p4, p0}, LBf/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, LJd/H;->i:Lef/p;

    .line 65
    .line 66
    new-instance p1, LJd/F;

    .line 67
    .line 68
    const/4 p2, 0x0

    .line 69
    invoke-direct {p1, p0, p2}, LJd/F;-><init>(LJd/H;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, LJd/H;->j:Lef/p;

    .line 77
    .line 78
    new-instance p1, LJd/F;

    .line 79
    .line 80
    const/4 p2, 0x1

    .line 81
    invoke-direct {p1, p0, p2}, LJd/F;-><init>(LJd/H;I)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 85
    .line 86
    .line 87
    new-instance p1, LJd/F;

    .line 88
    .line 89
    const/4 p2, 0x2

    .line 90
    invoke-direct {p1, p0, p2}, LJd/F;-><init>(LJd/H;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, LJd/H;->k:Lef/p;

    .line 98
    .line 99
    new-instance p1, LJd/F;

    .line 100
    .line 101
    const/4 p2, 0x3

    .line 102
    invoke-direct {p1, p0, p2}, LJd/F;-><init>(LJd/H;I)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, LJd/H;->l:Lef/p;

    .line 110
    .line 111
    new-instance p1, LJd/F;

    .line 112
    .line 113
    const/4 p2, 0x4

    .line 114
    invoke-direct {p1, p0, p2}, LJd/F;-><init>(LJd/H;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iput-object p1, p0, LJd/H;->m:Lef/p;

    .line 122
    .line 123
    return-void

    .line 124
    :cond_1
    const-string p1, "Port must be between 0 and 65535, or 0 if not set. Provided: "

    .line 125
    .line 126
    invoke-static {p3, p1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p2
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, LJd/H;

    .line 12
    .line 13
    if-eq v1, v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, LJd/H;

    .line 17
    .line 18
    iget-object v0, p0, LJd/H;->f:Ljava/lang/String;

    .line 19
    .line 20
    iget-object p1, p1, LJd/H;->f:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LJd/H;->f:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LJd/H;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
