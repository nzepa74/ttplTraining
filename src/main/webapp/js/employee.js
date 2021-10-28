employee = (function () {
    "use strict";
    let form = $('#employeeFormId');
    let isSubmitted = false;

    function _baseURL() {
        return 'api/employee/';
    }

    function getRoles() {

    }


    return {
        getRoles: getRoles
    }
})();

$(document).ready(function () {
    employee.getRoles();
});