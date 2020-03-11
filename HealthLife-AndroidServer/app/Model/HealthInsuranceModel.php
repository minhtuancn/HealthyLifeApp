<?php

namespace App\Model;

use Illuminate\Database\Eloquent\Model;

class HealthInsuranceModel extends Model
{
    protected $table = 'healthinsurance';
    protected $primaryKey = 'HealthInsuranceID';
    public $timestamps = false;

    protected $fillable = [
        'HealthInsuranceCardCode', 'HealthInsuranceMFD','HealthInsuranceEXP','HospitalRegister'
    ];
}
