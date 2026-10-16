.class public final LPc/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/i;


# static fields
.field public static final k:Ljava/util/HashMap;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final b:Lcom/google/firebase/auth/FirebaseAuth;

.field public final c:Ljava/lang/String;

.field public final d:LJ8/z;

.field public final e:I

.field public final f:LJ9/x;

.field public final g:LK8/j;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/Integer;

.field public j:Luc/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LPc/U;->k:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;LPc/m;LPc/Q;LK8/j;LJ8/z;LJ9/x;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LPc/U;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object p4, p0, LPc/U;->g:LK8/j;

    .line 16
    .line 17
    iput-object p5, p0, LPc/U;->d:LJ8/z;

    .line 18
    .line 19
    invoke-static {p2}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, LPc/U;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 24
    .line 25
    iget-object p1, p3, LPc/Q;->a:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p1, p0, LPc/U;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object p1, p3, LPc/Q;->b:Ljava/lang/Long;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    long-to-int p4, p1

    .line 36
    int-to-long v0, p4

    .line 37
    cmp-long p1, p1, v0

    .line 38
    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    iput p4, p0, LPc/U;->e:I

    .line 42
    .line 43
    iget-object p1, p3, LPc/Q;->d:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    iput-object p1, p0, LPc/U;->h:Ljava/lang/String;

    .line 48
    .line 49
    :cond_0
    iget-object p1, p3, LPc/Q;->c:Ljava/lang/Long;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    long-to-int p3, p1

    .line 58
    int-to-long p4, p3

    .line 59
    cmp-long p1, p1, p4

    .line 60
    .line 61
    if-nez p1, :cond_1

    .line 62
    .line 63
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, LPc/U;->i:Ljava/lang/Integer;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_2
    :goto_0
    iput-object p6, p0, LPc/U;->f:LJ9/x;

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    .line 82
    .line 83
    .line 84
    throw p1
.end method


# virtual methods
.method public final onCancel(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LPc/U;->j:Luc/h;

    .line 3
    .line 4
    iget-object v0, p0, LPc/U;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 12

    .line 1
    check-cast p2, Luc/h;

    .line 2
    .line 3
    iput-object p2, p0, LPc/U;->j:Luc/h;

    .line 4
    .line 5
    new-instance v3, LPc/T;

    .line 6
    .line 7
    invoke-direct {v3, p0}, LPc/T;-><init>(LPc/U;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LPc/U;->h:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p2, p0, LPc/U;->c:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p0, LPc/U;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object v0, v1, Lcom/google/firebase/auth/FirebaseAuth;->g:LK8/f;

    .line 19
    .line 20
    iput-object p2, v0, LK8/f;->c:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p1, v0, LK8/f;->d:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LPc/U;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    move-object v6, p1

    .line 34
    check-cast v6, Landroid/app/Activity;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    move-object v5, p2

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v5, p1

    .line 42
    :goto_0
    iget-object p2, p0, LPc/U;->g:LK8/j;

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    move-object v8, p2

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object v8, p1

    .line 49
    :goto_1
    iget-object p2, p0, LPc/U;->d:LJ8/z;

    .line 50
    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    move-object v9, p2

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    move-object v9, p1

    .line 56
    :goto_2
    iget p2, p0, LPc/U;->e:I

    .line 57
    .line 58
    int-to-long v10, p2

    .line 59
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 60
    .line 61
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 62
    .line 63
    invoke-virtual {v0, v10, v11, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v10

    .line 67
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-object p2, p0, LPc/U;->i:Ljava/lang/Integer;

    .line 72
    .line 73
    if-eqz p2, :cond_4

    .line 74
    .line 75
    sget-object v0, LPc/U;->k:Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, LJ8/w;

    .line 82
    .line 83
    if-eqz p2, :cond_4

    .line 84
    .line 85
    move-object v7, p2

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    move-object v7, p1

    .line 88
    :goto_3
    const-wide/16 p1, 0x0

    .line 89
    .line 90
    cmp-long p1, v10, p1

    .line 91
    .line 92
    if-ltz p1, :cond_b

    .line 93
    .line 94
    const-wide/16 p1, 0x78

    .line 95
    .line 96
    cmp-long p1, v10, p1

    .line 97
    .line 98
    if-gtz p1, :cond_b

    .line 99
    .line 100
    const-string p1, "A phoneMultiFactorInfo must be set for second factor sign-in."

    .line 101
    .line 102
    const/4 p2, 0x0

    .line 103
    const/4 v0, 0x1

    .line 104
    if-nez v8, :cond_6

    .line 105
    .line 106
    const-string v4, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()"

    .line 107
    .line 108
    invoke-static {v5, v4}, Lcom/google/android/gms/common/internal/v;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    if-nez v9, :cond_5

    .line 112
    .line 113
    move p2, v0

    .line 114
    :cond_5
    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_6
    iget-object v4, v8, LK8/j;->a:Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v4, :cond_8

    .line 121
    .line 122
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    if-nez v9, :cond_7

    .line 126
    .line 127
    move p2, v0

    .line 128
    :cond_7
    const-string p1, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session."

    .line 129
    .line 130
    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_8
    if-eqz v9, :cond_9

    .line 135
    .line 136
    move v4, v0

    .line 137
    goto :goto_4

    .line 138
    :cond_9
    move v4, p2

    .line 139
    :goto_4
    invoke-static {p1, v4}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 140
    .line 141
    .line 142
    if-nez v5, :cond_a

    .line 143
    .line 144
    move p2, v0

    .line 145
    :cond_a
    const-string p1, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead."

    .line 146
    .line 147
    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 148
    .line 149
    .line 150
    :goto_5
    new-instance v0, LJ8/v;

    .line 151
    .line 152
    iget-object v4, v1, Lcom/google/firebase/auth/FirebaseAuth;->A:Ljava/util/concurrent/Executor;

    .line 153
    .line 154
    invoke-direct/range {v0 .. v9}, LJ8/v;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/Long;LPc/T;Ljava/util/concurrent/Executor;Ljava/lang/String;Landroid/app/Activity;LJ8/w;LK8/j;LJ8/z;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->j(LJ8/v;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 162
    .line 163
    const-string p2, "We only support 0-120 seconds for sms-auto-retrieval timeout"

    .line 164
    .line 165
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p1
.end method
