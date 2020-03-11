<?php

namespace App\Model;

use Illuminate\Notifications\Notifiable;
use Illuminate\Foundation\Auth\User as Authenticatable;

class UserModel extends Authenticatable
{
    use Notifiable;

    const ACTIVE = 1;
    const INACTIVE = 0;

    protected $table = 'users';
    protected $primaryKey = 'UserID';

    protected $fillable = [
        'email', 'RoleID','password','codeverify','active',
    ];

    protected $hidden = [
        'password', 'codeverify',
    ];
}