.class public final LA9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LDd/c;LL9/b;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, LA9/c;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, LA9/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LA9/c;->a:I

    iput-object p1, p0, LA9/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, LA9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, LA9/c;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, LA/e0;

    .line 9
    .line 10
    sget-object v1, Lmd/b0;->d:Lmd/j;

    .line 11
    .line 12
    sget-object v2, Lmd/Y;->d:Ljava/util/BitSet;

    .line 13
    .line 14
    new-instance v2, Lmd/W;

    .line 15
    .line 16
    const-string v3, "X-Goog-Api-Key"

    .line 17
    .line 18
    invoke-direct {v2, v3, v1}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lmd/W;

    .line 22
    .line 23
    const-string v4, "X-Android-Package"

    .line 24
    .line 25
    invoke-direct {v3, v4, v1}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 26
    .line 27
    .line 28
    new-instance v4, Lmd/W;

    .line 29
    .line 30
    const-string v5, "X-Android-Cert"

    .line 31
    .line 32
    invoke-direct {v4, v5, v1}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lmd/b0;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iget-object v0, v0, LA/e0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ls8/g;

    .line 43
    .line 44
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 45
    .line 46
    .line 47
    iget-object v5, v0, Ls8/g;->a:Landroid/content/Context;

    .line 48
    .line 49
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 54
    .line 55
    .line 56
    iget-object v7, v0, Ls8/g;->c:Ls8/l;

    .line 57
    .line 58
    iget-object v7, v7, Ls8/l;->a:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1, v2, v7}, Lmd/b0;->f(Lmd/Y;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v3, v6}, Lmd/b0;->f(Lmd/Y;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/16 v2, 0x40

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    :try_start_0
    invoke-virtual {v0, v6, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 83
    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    array-length v2, v0

    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    aget-object v0, v0, v2

    .line 91
    .line 92
    if-nez v0, :cond_0

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 96
    .line 97
    .line 98
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    :try_start_1
    const-string v2, "SHA1"

    .line 100
    .line 101
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v2, Lm8/e;->e:Lm8/b;

    .line 110
    .line 111
    invoke-virtual {v2}, Lm8/e;->h()Lm8/e;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2, v0}, Lm8/e;->c([B)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 119
    :catch_0
    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    .line 120
    .line 121
    invoke-virtual {v1, v4, v3}, Lmd/b0;->f(Lmd/Y;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_2
    return-object v1

    .line 125
    :pswitch_0
    check-cast v0, LVa/ka;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    const-string v0, "firebaseinappmessaging.googleapis.com"

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_1
    check-cast v0, LY9/c;

    .line 134
    .line 135
    iget-object v0, v0, LY9/c;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v0, Landroid/app/Application;

    .line 138
    .line 139
    invoke-static {v0}, LFe/b;->l(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_2
    check-cast v0, LL9/b;

    .line 144
    .line 145
    invoke-virtual {v0}, LL9/b;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, LJ9/Y;

    .line 150
    .line 151
    new-instance v1, LJ9/Z;

    .line 152
    .line 153
    invoke-direct {v1, v0}, LJ9/Z;-><init>(LJ9/Y;)V

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :pswitch_3
    return-object v0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
